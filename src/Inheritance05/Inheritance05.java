package Inheritance05;

class Parent {
	void display() {
		System.out.println("�θ� Ŭ������ display() �޼ҵ��Դϴ�.");
	}

}

class Child extends Parent {
	void display() {
		System.out.println("�ڽ� Ŭ������ display() �޼ҵ��Դϴ�.");
	}

}

public class Inheritance05 {

	public static void main(String[] args) {

		
		

//		Child ch = new Child();
//		ch.display();

		Parent pc = new Child();
		pc.display();
		

	}

}