package sec03_methodoverriding.EX02_MethodOverriding_2;

class Animal {
	void cry() {
		System.out.println("����");
	}

	void overload() {
		System.out.println("�ȸ�");
	}
}

class Bird extends Animal {
	void cry() {
		System.out.println("±");
	}

	void overload(String food) {
		System.out.println(food);
	}

}

class Cat extends Animal {
	void cry() {
		System.out.println("��");
	}

	void overload(String food, String food2) {
		System.out.println(food + " " + food2);
	}

}

class Dog extends Animal {
	void cry() {
		System.out.println("��");
	}

}

public class MethodOverriding_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal aa = new Animal();
		Animal bb = new Bird();
		Bird cc = new Bird();

//		bb.overload("1");
		cc.overload("1");

	}

}
