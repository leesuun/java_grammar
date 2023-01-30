package sec02_interface.EX01_InterfaceCharacteristics;

interface A {
	public static int a = 5;

	public abstract void abc();

	// interface default �޼��� ����
	default void aaa() {
		System.out.println("interface A�� ����Ʈ �޼���");
	}
	// interface static �޼��� ����
	static void sss() {
		System.out.println("interface A�� ���� �޼���");
	}
}

interface B {
	int b = 3;
	void bcd();

}

// interface ���� ���
class C extends Object implements A, B {
	public void abc() {
		A.super.aaa(); // �θ� �������̽��� aaa()�޼��� ȣ��
		System.out.println("interface A�� �߻� �޼��� ");
		System.out.println(super.toString());

	}

	public void bcd() {
		System.out.println("interface B�� �߻� �޼��� ");
	}
	
	public void sss() {
		A.sss();
	}
}

public class InterfaceCharacteristics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
//		c.abc();
//		c.bcd();
//		A.sss();
		c.sss();

	}

}
