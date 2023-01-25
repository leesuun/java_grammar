package _array;

class A {
	int a, b, c, d;

	A() {
		this(5);
	}

	A(int k) {
		a = k;
		b = k;
		c = k;
		d = k;
	}
}

public class exam5 {

	public exam5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		

	}

}
