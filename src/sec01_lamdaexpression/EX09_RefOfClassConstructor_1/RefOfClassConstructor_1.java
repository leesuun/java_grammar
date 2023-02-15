package sec01_lamdaexpression.EX09_RefOfClassConstructor_1;

interface A {
	B abc(int k);

}

class B {
	B(int k) {
		System.out.println("두 번째 생성자");
	}
}

public class RefOfClassConstructor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = B::new;
		A a2 = k -> new B(1);

		a.abc(1);
		a2.abc(2);
	}

}
