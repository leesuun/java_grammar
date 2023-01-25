package sec05_thismethod.EX02_ThisMethod_2;

class A {

	int value_1, value_2, value_3, value_4;

	A() {
		value_1 = 1;
		value_2 = 2;
		value_3 = 3;
		value_4 = 4;
	}

	A(int value_2) {
		this();
		this.value_2 = value_2;
	}

	A(int value_3, int value_4) {
		this();
		this.value_3 = value_3;
		this.value_4 = value_4;

	}

	void print() {
		System.out.print(value_1 + " " + value_2 + " " + value_3 + " " + value_4);
		System.out.println();

	}

}

public class ThisMethod_2 {

	public ThisMethod_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A();
		A a2 = new A(20);
		A a3 = new A(30, 40);

		a1.print();
		a2.print();
		a3.print();

	}

}
