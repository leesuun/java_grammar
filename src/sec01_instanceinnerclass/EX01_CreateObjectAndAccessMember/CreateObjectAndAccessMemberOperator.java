package sec01_instanceinnerclass.EX01_CreateObjectAndAccessMember;

interface ABC {
	void abc();
}

class B implements ABC {
	public void abc() {
		System.out.println("입력매개변수 전달");
	}
}

class C {
	void cde(ABC ABC){
		ABC.abc();
	}

}

public class CreateObjectAndAccessMemberOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();

		ABC a = new B();
		c.cde(a);

		c.cde(new B());

	}

}
