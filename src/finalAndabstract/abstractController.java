package finalAndabstract;

abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	// 추상 클래스를 상속받은 자식은 부모의 추상 메서드를 오버라이딩 해야함
	/* 장점 
	 * 1. 개발과정에서 오타 발생 방지
	 * 2. 추상 클래스의 추상 메서드를 상속받은 모든 자식 클래스는 항상 부모의 추상 메서드가 정의되는 것을 보장 
	 */
	void cry() {
		System.out.println("고양이 r");
	}

	void cRy() {
		System.out.println("고양이 R");
	}

}

class Dog extends Animal {
	void cry() {
		System.out.println("강아지");
	}

}

public class abstractController {

	static public void main(String[] args) {

	}

}
