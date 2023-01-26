package sec02_staticmodifier.EX01_StaticField_1;

class A {
	int m = 3;
	static int n = 5;

}

public class StaticField_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A();
		A a2 = new A();

		System.out.printf("%n", A.n);
		A.n++;

		System.out.println(A.n);
		a1.n++;
		a1.m++;
		System.out.println(A.n);
		a2.n++;
		a2.m++;
		System.out.println(A.n);

	}

}
