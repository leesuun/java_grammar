package createClass_savePhoneNameInfo_PhoneBook;

import java.util.Arrays;
import java.util.Scanner;

class Phone {

	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}

public class PhoneBook {

	private final String SEARCH = "검색";
	private final String SHOWLIST = "전체검색";
	private final String EDIT = "수정";
	private final String DELETE = "삭제";
	private final String EXIT = "종료";

	private Scanner sc = new Scanner(System.in);
	private Phone[] phoneAry;

	private void initPhoneBook() {

		int ERR_COUNT = 100;
		while (ERR_COUNT-- > 0) {
			System.out.printf("인원수:");
			try {
				phoneAry = new Phone[sc.nextInt()];

				for (int i = 0; i < phoneAry.length; i++) {
					System.out.printf("이름과 번호입력:");
					String name = sc.next(), tel = sc.next();
					phoneAry[i] = new Phone(name, tel);
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

	/*
	 * 질문사항
	 * 
	 * startFunction(String menu){}라는 메서드를 만들고 검색, 수정, 삭제 기능을 합치는 방식.
	 * 
	 * 장점 - 코드 짧아짐, 한눈에 보기 좋음 단점 - 메서드 재사용 불가능해짐
	 * 
	 */

	void showAllPhoneList() {

		System.out.println("--------------------");
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

			for (int i = 0; i < phoneAry.length; i++) {
				if (userName.equals(phoneAry[i].getName())) {
					System.out.println(userName + "의 전화번호는 " + phoneAry[i].getTel() + " 입니다.");
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	void editPhone() {
		System.out.printf("수정할 유저이름 입력:");
		String userName = sc.next();

		for (int i = 0; i < phoneAry.length; i++) {
			if (userName.equals(phoneAry[i].getName())) {
				System.out.printf("이름과 번호입력:");
				String name = sc.next(), tel = sc.next();
				phoneAry[i] = new Phone(name, tel);
				break;
			}
		}
	}

	void deletePhone() {
		System.out.printf("삭제할 유저이름 입력:");
		String userName = sc.next();

		for (int i = 0; i < phoneAry.length; i++) {
			if (userName.equals(phoneAry[i].getName())) {
				phoneAry[i] = null;
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
			String menu = sc.next();

			switch (menu) {

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
				throw new IllegalArgumentException("Unexpected value: " + menu);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PhoneBook().run();

	}

}
