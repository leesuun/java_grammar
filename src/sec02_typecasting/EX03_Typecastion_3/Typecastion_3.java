package sec02_typecasting.EX03_Typecastion_3;

class A {

}

class B extends A {

}

public class Typecastion_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		A ab = new B();

		System.out.println(aa instanceof B);
		System.out.println(ab instanceof A);

		if (aa instanceof B) {
			B b = (B) aa;
			System.out.println("aa�� B�� ĳ���� �߽��ϴ�.");
		} else {
			System.out.println("aa�� B�� ĳ���� �Ұ���");
		}

		if ("�ȳ�" instanceof String) {
			System.out.println("�ȳ��� String���� ĳ���ð��� String -> String");
		} else {
			System.out.println("�ȳ��� String���� ĳ���� �Ұ���");
		}

		if (new int[] { 1, 2, 3 } instanceof int[]) {
			System.out.println("[1,2,3]�� int[]�� ĳ���� ����");

		}

	}

}
