package sec_03_constructor.EX02_ConstructorOverloading;

import java.util.Arrays;

class A {
	int method() {
		return 1;
	}

	A() {
		int value = 1;
		System.out.printf("ù��° ������, a: %d\n", value);
		System.out.println(this.method());
	}

	A(int value) {
		System.out.printf("�ι�° ������, value: %d\n", value);
	}

	A(int... values) {
		System.out.printf("����° ������, values: %s\n", Arrays.toString(values));
	}

	A(String a, A e, int... values) {
		System.out.printf("����° ������, values: %s\n", a);
		System.out.printf("����° ������, values: %s\n", e);
		System.out.printf("����° ������, values: %s\n", Arrays.toString(values));
	}
}

public class ConstructorOverloading {

	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A();
		A a2 = new A(1);
		A a3 = new A("����", a1, new int[] { 1, 2, 3, 4, 5 });

		System.out.println();

	}

}
