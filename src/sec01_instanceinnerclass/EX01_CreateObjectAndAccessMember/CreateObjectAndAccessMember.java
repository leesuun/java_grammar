package sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;

class A {

	int a = 3;

	void method1() {
		System.out.println("class A method1() ȣ��");
	}

	static void method2(B b) {
		System.out.println("class A method2() ȣ��");

	}

	class B extends A {
		int a = 5;

		void abc() {
			System.out.println("class B abc()�� ���� �޼��� ȣ��");
		}

		void bcd() {
			super.method1();

			System.out.println(super.a);
			System.out.println("class B bcd() ȣ��");
			System.out.println(B.this.a);

			abc();
		}
	}

}

public class CreateObjectAndAccessMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();

		A.B b = a.new B();
		b.bcd();

	}

}
