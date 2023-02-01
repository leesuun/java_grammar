package classInheritanceAndPolymorphism_practice;

class Q4_A {

}

class Q4_B extends Q4_A {

}

class Q4_C extends Q4_B {

}

class Q4_D extends Q4_C {

}

class Q4_E extends Q4_B {

}

public class Question_4 {

	public static void main(String[] args) {

		// X, X, X, X
		// O, X, X, X
		// O, O, X, X

		Q4_A a1 = new Q4_A();
//		Q4_B b1 = (Q4_B) a1;
//		Q4_C c1 = (Q4_C) a1;
//		Q4_D d1 = (Q4_D) a1;
//		Q4_E e1 = (Q4_E) a1;
		
		Q4_A a2 = new Q4_B();
//		Q4_B b2 = (Q4_B) a2;
//		Q4_C c2 = (Q4_C) a2;
//		Q4_D d2 = (Q4_D) a2;
//		Q4_E e2 = (Q4_E) a2;

		Q4_A a3 = new Q4_C();
//		Q4_B b3 = (Q4_B) a3;
//		Q4_C c3 = (Q4_C) a3;
//		Q4_D d3 = (Q4_D) a3;
//		Q4_E e3 = (Q4_E) a3;
		

	}
}
