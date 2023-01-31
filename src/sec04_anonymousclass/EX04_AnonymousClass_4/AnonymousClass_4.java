package sec04_anonymousclass.EX04_AnonymousClass_4;

class A {
	int a = 3;

	void abc() {
		int b = 4;

		class B {
			int b = 5;

			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
				b = 7;
				this.b = 6;
			}
		}
		B bb = new B();
		bb.bcd();

	}
}

public class AnonymousClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.abc();
	}
}
