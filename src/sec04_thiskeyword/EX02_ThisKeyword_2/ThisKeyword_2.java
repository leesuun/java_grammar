package sec04_thiskeyword.EX02_ThisKeyword_2;

class A {
	int m;
	int n;

	void init(int m, int n) {
		m = m;
		n = n;
	}
}

class B {
	int m;
	int n;

	void init(int m, int n) {
//		this(); this() Ű����� Ŭ���� �����ڿ��� ����
		this.m = m;
		this.n = n;
	}
}

public class ThisKeyword_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		B b = new B();
		a.init(1, 2);
		b.init(1, 2);
		System.out.printf("%d %d\n", a.m, a.n);
		System.out.printf("%d %d", b.m, b.n);

	}

}
