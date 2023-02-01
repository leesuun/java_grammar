package classInheritanceAndPolymorphism_practice;

class Q5_A {

}

class Q5_B extends Q5_A {

}

class Q5_C extends Q5_A {

}

class Q5_D extends Q5_B {

}

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// T, F, F, F
		// T, T, F, T

		Q5_A aa = new Q5_A();
		System.out.println(aa instanceof Q5_A);
		System.out.println(aa instanceof Q5_B);
		System.out.println(aa instanceof Q5_C);
		System.out.println(aa instanceof Q5_D);

		System.out.println();

		Q5_A ad = new Q5_D();
		System.out.println(ad instanceof Q5_A);
		System.out.println(ad instanceof Q5_B);
		System.out.println(ad instanceof Q5_C);
		System.out.println(ad instanceof Q5_D);

	}

}
