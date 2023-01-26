package sec02_typecasting.EX01_Typecasting_1;

class A {

}

class B extends A {

}

class C extends B {

}

class D extends B {

}

public class Typecasting_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A ad = new D();
//		B b1 = (B)ad;
		C b2 = (C)ad; // x
	}

}
