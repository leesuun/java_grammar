package sec01_packageimport.common;

import java.util.Arrays;

public class A {
	public int m = 3;
	public int n = 4;

	public void print() {
		System.out.println("import");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();

		System.out.println(a.m + " common");
		System.out.println(a.n + " common");
		System.out.println(Arrays.toString(args));
		a.print();
		
		a.m =5;
		a.n =6;
		
		System.out.println(a.m + " common");
		System.out.println(a.n + " common");

	}

}
