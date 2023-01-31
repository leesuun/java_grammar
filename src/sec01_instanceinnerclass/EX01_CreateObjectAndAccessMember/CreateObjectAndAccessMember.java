package sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;

class A {

	int a = 3;

	void method1() {
		System.out.println("class A method1() 호출");
	}

	static void method2(B b) {
		System.out.println("class A method2() 호출");

	}

	class B extends A {
		int a = 5;

		void abc() {
			System.out.println("class B abc()의 지역 메서드 호출");
		}

		void bcd() {
			super.method1();

			System.out.println(super.a);
			System.out.println("class B bcd() 호출");
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
