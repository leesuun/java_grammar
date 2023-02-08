package sec05_inheritanceofgenric.EX02_InheritanceGenericMethod;

//class MyGenric<T> {
//	T t;
//
//	public T get() {
//		return t;
//	}
//
//	public void set(T t) {
//		this.t = t;
//	}
//}
//
//class A {
//	public String toString() {
//		return "클래스 A 객체";
//	}
//}
//
//class B {
//	public String toString() {
//		return "클래스 B 객체";
//	}
//}
//
//public class InheritanceGenericMethod {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		A a_in = new A();
//		B b_in = new B();
//
//		
//		MyGenric<A> mg1 = new MyGenric<A>();
//		MyGenric<B> mg2 = new MyGenric<B>();
//		
//		mg1.set(a_in);
//		A a_out = mg1.get();
//		System.out.println(a_out);
//		
//		mg2.set(b_in);
//		B b_out = mg2.get();
//		System.out.println(b_out);
//
//	}
//
//}

class MyClass{
	public <T> T myMethod(T t) {
		return t;
	}
}

public class InheritanceGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass mc = new MyClass();
		String out1 = mc.<String>myMethod("감사");
		Integer out2 = mc.<Integer>myMethod(3);
		Double out3 = mc.<Double>myMethod(3.1);
		
		System.out.println(out1);
		System.out.println(out2);
		System.out.println(out3);

	}

}



