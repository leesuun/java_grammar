package finalAndabstract;

class A {
	final int a;
	int b = 5;
	
	//final �ʵ� ������ �����ڸ� ���� �ʱ�ȭ �� �� �ִ�.
	A(){
		this.a= 3;
	}

	final void print() {
		System.out.println("final method");

	}
}

class B extends A {
// final �޼���� �������̵� �Ұ���
//	void print() {
//		
//	}
}

final class C {

}
//class D extends C{
//	// final Ŭ������ ��� �Ұ���
//}

public class finalController {

	static public void main(String[] args) {

		A a = new A();
		B b = new B();
//		a.a = 2; final ��������� ��������� �����ǰ�, �� ���� �Ұ�
//		a.b = 4;
		
//		System.out.println(a.a);

		

	}

}
