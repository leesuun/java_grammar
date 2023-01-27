package sec04_overlapmember.EX03_OverlapStaticMethod;

class A {

	static int a = 3;

	static void print() {
		System.out.println("A 정적필드 메서드");
	}

	void print2() {
		System.out.println("A 인스턴스 필드 메서드");
	}

}

class B extends A {
	static int a = 4;

	static void print() {
		System.out.println("B 정적필드 메서드");
	}

	void print2() {
		System.out.println("B 인스턴스 필드 메서드");
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
		aa.print2(); // A 인스턴스 필드 메서드
		bb.print2(); // B 인스턴스 필드 메서드
		ab.print2(); // B 인스턴스 필드 메서드
//		System.out.println(ab.a);

//		aa.print();
//		bb.print();
//		ab.print();

	}

}
