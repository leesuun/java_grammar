package sec04_overlapmember.EX03_OverlapStaticMethod;

class A {

	static int a = 3;

	static void print() {
		System.out.println("A �����ʵ� �޼���");
	}

	void print2() {
		System.out.println("A �ν��Ͻ� �ʵ� �޼���");
	}

}

class B extends A {
	static int a = 4;

	static void print() {
		System.out.println("B �����ʵ� �޼���");
	}

	void print2() {
		System.out.println("B �ν��Ͻ� �ʵ� �޼���");
	}

}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A.print();
		B.print();
		System.out.println();

		A aa = new A();
		B bb = new B();
		A ab = new B();
		

//		System.out.println(aa instanceof B);
//		System.out.println(aa.a);
		aa.print2(); // A �ν��Ͻ� �ʵ� �޼���
		bb.print2(); // B �ν��Ͻ� �ʵ� �޼���
		ab.print2(); // B �ν��Ͻ� �ʵ� �޼���
//		System.out.println(ab.a);

//		aa.print();
//		bb.print();
//		ab.print();

	}

}
