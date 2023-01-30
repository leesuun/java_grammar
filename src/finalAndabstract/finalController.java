package finalAndabstract;

class A {
	final int a;
	int b = 5;
	
	//final 필드 변수는 생성자를 통해 초기화 할 수 있다.
	A(){
		this.a= 3;
	}

	final void print() {
		System.out.println("final method");

	}
}

class B extends A {
// final 메서드는 오버라이딩 불가능
//	void print() {
//		
//	}
}

final class C {

}
//class D extends C{
//	// final 클래스는 상속 불가능
//}

public class finalController {

	static public void main(String[] args) {

		A a = new A();
		B b = new B();
//		a.a = 2; final 멤버변수는 상수영역에 생성되고, 값 변경 불가
//		a.b = 4;
		
//		System.out.println(a.a);

		

	}

}
