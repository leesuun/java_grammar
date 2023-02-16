package createClass_savePhoneNameInfo_PhoneBook;

import java.util.Scanner;

/* ���� �ۼ�
 * 1. ������ �ڵ� ����
 * 2. ����
 * 3. �׽�Ʈ
*/

enum Menu {
	SEARCH("�˻�"), SHOWLIST("��ü�˻�"), EDIT("����"), DELETE("����"), EXIT("����");

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

	public final String SEARCH = "�˻�";
	public final String SHOWLIST = "��ü�˻�";
	public final String EDIT = "����";
	public final String DELETE = "����";
	public final String EXIT = "����";

	private Scanner sc = new Scanner(System.in);
	private Phone<String, String>[] phoneAry;

	@SuppressWarnings("unchecked")
	void initPhoneBook() {

		int ERR_COUNT = 100;
		while (ERR_COUNT-- > 0) {
			System.out.printf("�ο���:");
			try {
				phoneAry = new Phone[sc.nextInt()];

				for (int i = 0; i < phoneAry.length; i++) {
					System.out.printf("�̸��� ��ȣ�Է�:");
					String name = sc.next(), tel = sc.next();
					phoneAry[i] = new Phone<String, String>(name, tel);
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

	void showAllPhoneList() {

		System.out.println("--------------------");
		System.out.println("[��ü ���� ����]");
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
			int searchCount = 0;

			for (int i = 0; i < phoneAry.length; i++) {
				searchCount = i;
				if (userName.equals(phoneAry[i].getName())) {
					System.out.println(userName + "�� ��ȭ��ȣ�� " + phoneAry[i].getTel() + " �Դϴ�.");
					break;
				} else if (searchCount + 1 == phoneAry.length) {
					System.out.println("���� ���� �Դϴ�.");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception

		}

	}

	void editPhone() {
		System.out.printf("������ �����̸� �Է�:");
		String userName = sc.next();
		int searchCount = 0;

		for (int i = 0; i < phoneAry.length; i++) {
			if (userName.equals(phoneAry[i].getName())) {
				System.out.printf("�̸��� ��ȣ�Է�:");
				String name = sc.next(), tel = sc.next();
				phoneAry[i] = new Phone<String, String>(name, tel);
				System.out.println("�����Ǿ����ϴ�.");
				break;
			} else if (searchCount + 1 == phoneAry.length) {
				System.out.println("���� ���� �Դϴ�.");
			}

		}
	}

	void deletePhone() {
		System.out.printf("������ �����̸� �Է�:");
		String userName = sc.next();

		for (int i = 0; i < phoneAry.length; i++) {
			if (userName.equals(phoneAry[i].getName())) {
				phoneAry[i] = null;
				System.out.println("���� ������ �����Ǿ����ϴ�.");
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
				System.out.println("���α׷��� " + "����Ǿ����ϴ�.");
				return;
			}
			default:
				System.out.println("-----------------------------------------");
				System.out.println("[��ü�˻�, �˻�, ����, ����, ����] �߿� �����ϼ���.");
				System.out.println("-----------------------------------------");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PhoneBook().run();

	}

}
