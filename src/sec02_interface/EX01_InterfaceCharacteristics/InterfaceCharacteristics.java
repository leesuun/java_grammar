package sec02_interface.EX01_InterfaceCharacteristics;

interface A {
	public static int a = 5;

	public abstract void abc();

	// interface default 메서드 정의
	default void aaa() {
		System.out.println("interface A의 디폴트 메서드");
	}
	// interface static 메서드 정의
	static void sss() {
		System.out.println("interface A의 정적 메서드");
	}
}

interface B {
	int b = 3;
	void bcd();

}

// interface 다중 상속
class C extends Object implements A, B {
	public void abc() {
		A.super.aaa(); // 부모 인터페이스의 aaa()메서드 호출
		System.out.println("interface A의 추상 메서드 ");
		System.out.println(super.toString());

	}

	public void bcd() {
		System.out.println("interface B의 추상 메서드 ");
	}
	
	public void sss() {
		A.sss();
	}
}

public class InterfaceCharacteristics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
//		c.abc();
//		c.bcd();
//		A.sss();
		c.sss();

	}

}
