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

	private final String SEARCH = "�˻�";
	private final String SHOWLIST = "��ü�˻�";
	private final String EDIT = "����";
	private final String DELETE = "����";
	private final String EXIT = "����";

	private Scanner sc = new Scanner(System.in);
	private Phone[] phoneAry;

	private void initPhoneBook() {

		int ERR_COUNT = 100;
		while (ERR_COUNT-- > 0) {
			System.out.printf("�ο���:");
			try {
				phoneAry = new Phone[sc.nextInt()];

				for (int i = 0; i < phoneAry.length; i++) {
					System.out.printf("�̸��� ��ȣ�Է�:");
					String name = sc.next(), tel = sc.next();
					phoneAry[i] = new Phone(name, tel);
				}
				System.out.println("����Ǿ����ϴ�...");
				System.out.println();
				break;

			} catch (Exception e) {
				// TODO: handle exception
				sc.nextLine();
				System.out.println("���ڸ� �Է����ּ���...");
			}
		}

	}

	/*
	 * ��������
	 * 
	 * startFunction(String menu){}��� �޼��带 ����� �˻�, ����, ���� ����� ��ġ�� ���.
	 * 
	 * ���� - �ڵ� ª����, �Ѵ��� ���� ���� ���� - �޼��� ���� �Ұ�������
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
			System.out.printf("�˻��� �����̸� �Է�:");
			String userName = sc.next();

			for (int i = 0; i < phoneAry.length; i++) {
				if (userName.equals(phoneAry[i].getName())) {
					System.out.println(userName + "�� ��ȭ��ȣ�� " + phoneAry[i].getTel() + " �Դϴ�.");
					break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	void editPhone() {
		System.out.printf("������ �����̸� �Է�:");
		String userName = sc.next();

		for (int i = 0; i < phoneAry.length; i++) {
			if (userName.equals(phoneAry[i].getName())) {
				System.out.printf("�̸��� ��ȣ�Է�:");
				String name = sc.next(), tel = sc.next();
				phoneAry[i] = new Phone(name, tel);
				break;
			}
		}
	}

	void deletePhone() {
		System.out.printf("������ �����̸� �Է�:");
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
			System.out.println("�޴�����[��ü�˻�,�˻�,����,����,����]");
			System.out.printf("�Է�:");
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
				System.out.println("���α׷��� " + "����Ǿ����ϴ�.");
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
