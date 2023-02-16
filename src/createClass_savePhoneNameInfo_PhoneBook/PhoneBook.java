package createClass_savePhoneNameInfo_PhoneBook;

import java.util.Scanner;

/* 문서 작성
 * 1. 제공된 코드 이해
 * 2. 응용
 * 3. 테스트
*/

enum Menu {
	SEARCH("검색"), SHOWLIST("전체검색"), EDIT("수정"), DELETE("삭제"), EXIT("종료");

	private final String value;

	Menu(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

public class PhoneBook {

//	final String SEARCH = Menu.SEARCH.getValue();
//	final String SHOWLIST = Menu.SHOWLIST.getValue();
//	final String EDIT = Menu.EDIT.getValue();
//	final String DELETE = Menu.DELETE.getValue();
//	final String EXIT = Menu.EXIT.getValue();

	public final String SEARCH = "검색";
	public final String SHOWLIST = "전체검색";
	public final String EDIT = "수정";
	public final String DELETE = "삭제";
	public final String EXIT = "종료";

	private Scanner sc = new Scanner(System.in);
	private Phone<String, String>[] phoneAry;

	@SuppressWarnings("unchecked")
	void initPhoneBook() {

		int ERR_COUNT = 100;
		while (ERR_COUNT-- > 0) {
			System.out.printf("인원수:");
			try {
				phoneAry = new Phone[sc.nextInt()];

				for (int i = 0; i < phoneAry.length; i++) {
					System.out.printf("이름과 번호입력:");
					String name = sc.next(), tel = sc.next();
					phoneAry[i] = new Phone<String, String>(name, tel);
				}
				System.out.println("저장되었습니다...");
				System.out.println();
				break;

			} catch (Exception e) {
				// TODO: handle exception
				sc.nextLine();
				System.out.println("숫자만 입력해주세요...");
			}
		}

	}

	void showAllPhoneList() {

		System.out.println("--------------------");
		System.out.println("[전체 유저 정보]");
		for (int i = 0; i < phoneAry.length; i++) {
			if (phoneAry[i] != null) {
				System.out.println(i + 1 + "." + phoneAry[i].getName() + " " + phoneAry[i].getTel());
			}
		}
		System.out.println("--------------------");

	}

	void searchPhone() {

		try {
			System.out.printf("검색할 유저이름 입력:");
			String userName = sc.next();
			int searchCount = 0;

			for (int i = 0; i < phoneAry.length; i++) {
				searchCount = i;
				if (userName.equals(phoneAry[i].getName())) {
					System.out.println(userName + "의 전화번호는 " + phoneAry[i].getTel() + " 입니다.");
					break;
				} else if (searchCount + 1 == phoneAry.length) {
					System.out.println("없는 정보 입니다.");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception

		}

	}

	void editPhone() {
		System.out.printf("수정할 유저이름 입력:");
		String userName = sc.next();
		int searchCount = 0;

		for (int i = 0; i < phoneAry.length; i++) {
			if (userName.equals(phoneAry[i].getName())) {
				System.out.printf("이름과 번호입력:");
				String name = sc.next(), tel = sc.next();
				phoneAry[i] = new Phone<String, String>(name, tel);
				System.out.println("수정되었습니다.");
				break;
			} else if (searchCount + 1 == phoneAry.length) {
				System.out.println("없는 정보 입니다.");
			}

		}
	}

	void deletePhone() {
		System.out.printf("삭제할 유저이름 입력:");
		String userName = sc.next();

		for (int i = 0; i < phoneAry.length; i++) {
			if (userName.equals(phoneAry[i].getName())) {
				phoneAry[i] = null;
				System.out.println("유저 정보가 삭제되었습니다.");
				break;
			}
		}
		showAllPhoneList();
	}

	void run() {
		initPhoneBook();

		while (true) {
			System.out.println("메뉴선택[전체검색,검색,삭제,수정,종료]");
			System.out.printf("입력:");
			String select = sc.next();

			switch (select) {

			case SEARCH: {
				searchPhone();
				break;
			}
			case SHOWLIST: {
				showAllPhoneList();
				break;
			}
			case EDIT: {
				editPhone();
				break;
			}
			case DELETE: {
				deletePhone();
				break;
			}
			case EXIT: {
				System.out.println("프로그램이 " + "종료되었습니다.");
				return;
			}
			default:
				System.out.println("-----------------------------------------");
				System.out.println("[전체검색, 검색, 삭제, 수정, 종료] 중에 선택하세요.");
				System.out.println("-----------------------------------------");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PhoneBook().run();

	}

}
