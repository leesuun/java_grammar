package sec02_staticmodifier.EX03_StaticMethod;

class A {
	int a = 1;
	int d = 2;
	static int b = 2;
	static int c = 3;

	static int sum() {
		b = b + c;
		return b + c;
	}

	int sum(int a, int b) {
		return a + b;
	}

}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		System.out.println(a.sum(1, 2));
		System.out.println(A.sum());
		System.out.println(A.sum());
		System.out.println(A.sum());

	}

}
