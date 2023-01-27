package sec05_superkeywordsupermethod.EX04_SuperMethod_2;

class A {
	A() {
		this(3);
		System.out.println("A 持失切 1");
	}

	A(int a) {
		System.out.println("A 持失切 2");
	}
}

class B extends A {
	B() {
		this(3);
		System.out.println("B 持失切 1");
	}

	B(int a) {
		System.out.println("B 持失切 2");
	}

}

public class SuperMethod_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aa1 = new A();
		System.out.println();
		A aa2 = new A(3);
		System.out.println();

		B bb1 = new B();
		System.out.println();
		B bb2 = new B(3);
		System.out.println();
	}

}
