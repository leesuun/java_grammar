package sec06_objectclass.EX02_ObjectMethod_equals;

class A {
	String name;

	A(String name) {
		this.name = name;
	}
}

class B {
	String name;

	B(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof B) {
			if (this.name == ((B) obj).name) {
				return true;
			}
		}
		return false;
	}

}

public class ObjectMethod_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A("¾È³ç");
		A a2 = new A("¾È³ç");

		System.out.println(a1 + " " + a2);
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));

		B b1 = new B("¾È³ç");
		B b2 = new B("¾È³ç");
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

	}

}
