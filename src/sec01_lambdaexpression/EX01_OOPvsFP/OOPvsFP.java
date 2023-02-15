package sec01_lambdaexpression.EX01_OOPvsFP;

interface A {
	public abstract void abc(int a, B b);
}

class B {

	public B() {
		System.out.println(this);
	}
}

public class OOPvsFP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();

		A a3 = (a, B) -> System.out.println("매개변수1: " + a);
		a3.abc(3, b);

	}

}
