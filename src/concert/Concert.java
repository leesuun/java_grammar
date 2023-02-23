package concert;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Concert {
	private String hallName;
	private List<Group> group = new ArrayList<>(3);
	private Scanner scanner = new Scanner(System.in);
	int groupCnt = 0;

	public Concert(String hallName) {
		this.hallName = hallName;
		group.add(new Group('S', 10));
		group.add(new Group('A', 10));
		group.add(new Group('B', 10));
	}

	// 콘서트 예약
	private void reserve() {
		int errFlag = 0;
		while (errFlag == 0) {
			try {
				System.out.println("좌석 등급 S(1), A(2), B(3)\n");
				showAll();
				System.out.printf("예약할 좌석 등급 선택:");
				int type = scanner.nextInt();
				if (type < 1 || type > 3) {
					System.out.println("잘못된 좌석 타입입니다.");
					return;
				}

				if (group.get(type - 1).reserve()) {
					System.out.println("[예약 완료]");
					showAll();
					System.out.println();
					errFlag = 1;
				}

			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("\n------------------------------");
				System.out.println("!좌석 등급을 번호로 입력해주세요 ex) 1, 2, 3");
				System.out.printf("------------------------------\n\n");
				scanner.nextLine();

			}
		}
	}

	// 콘서트 예약 검색
	private void search() {
		boolean isUser = false;
		System.out.printf("검색할 유저이름 입력:");
		String searchName = scanner.next();
		for (int i = 0; i < group.size(); i++) {
			if (isUser = group.get(i).search(searchName)) {
				break;
			}
		}
		if (!isUser) {
			System.out.printf("없는 유저 입니다.\n\n");
			scanner.nextLine();
		}

	}

	// 콘서트 예약 취소
	private void cancel() {
		int errFlag = 0;

		while (errFlag == 0) {
			try {
				System.out.printf("좌석 ");
				group.forEach((g) -> {
					System.out.printf(g.getType() + ":" + groupCnt + " ");
					groupCnt++;
				});
				System.out.println();

				System.out.printf("취소할 좌석 타입:");
				int type = scanner.nextInt();
				if (type < 1 || type > group.size()) {
					System.out.println("없는 좌석 타입 입니다.");
					return;
				}
				group.get(type - 1).cancel();
				group.get(type - 1).show();
				System.out.println();
				errFlag = 1;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("------------------------------------------");
				System.out.println("!취소 할 좌석의 타입 번호를 입력해주세요. ex) 1,2,3");
				System.out.printf("-----------------------------------------\n\n");
				scanner.nextLine();
			}

		}

	}

	private void addSeatGroup() {
		Group lastGroup = group.get(group.size() - 1);
		char nextGroupType = Character.toUpperCase((char) (lastGroup.getType() + 1));
		try {
			System.out.printf("좌석 수 입력:");
			int number = scanner.nextInt();
			if (number <= 0) {
				System.out.println("1자리 이상의 좌석을 생성해주세요.");
				scanner.nextLine();
				return;
			}
			group.add(new Group(nextGroupType, number));
			System.out.println(nextGroupType + " 타입의 좌석이 " + number + " 개 생성되었습니다.");
			showAll();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			scanner.nextLine();
		} catch (NegativeArraySizeException e) {
			// TODO: handle exception
			System.out.println("1자리 이상의 좌석을 생성해주세요.");
			scanner.nextLine();
		}

	}

	public void showAll() {
		if (group.size() >= 1) {
			System.out.println("[전체 좌석 조회]");
			for (Group groupRow : group) {
				groupRow.show();
			}
			System.out.println();
		}
	}

	// 콘서트 예약/취소/검색 등
	public void run() {

		System.out.println("-------------------------");
		System.out.println(hallName + " 예약 시스템입니다.");
		System.out.println("로딩중....");
		System.out.printf("-------------------------\n\n");

		try {
//			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		int choice = 0;
		while (choice != 6) {

			System.out.println("사용가능한 메뉴[예약:1, 조회:2, 전체조회:3, 예약취소:4, 좌석등급추가:5, 종료:6]");
			System.out.printf("선택:");

			try {
				choice = scanner.nextInt();
				System.out.println("-------------------------");
				System.out.println();

			} catch (InputMismatchException e) {
				// TODO: handle exception
				scanner.nextLine();
			}

			switch (choice) {
			case 1: // 예약
				reserve();
				break;
			case 2: // 조회
				search();
				break;
			case 3: // 전체조회
				showAll();
				break;
			case 4: // 예약취소
				cancel();
				break;
			case 5: // 좌석 등급 추가
				addSeatGroup();
				break;
			case 6: // 끝내기
				scanner.close();
				System.out.println("프로그램이 종료되었습니다.");
				return;

			default:
				System.out.println("------------------------------------");
				System.out.println("!메뉴 번호를 입력해주세요 ex) 1, 2, 3, 4");
				System.out.printf("------------------------------------\n\n");
			}
		}
	}
}