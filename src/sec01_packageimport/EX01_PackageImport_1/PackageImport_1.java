package sec01_packageimport.EX01_PackageImport_1;

import sec01_packageimport.common.A;

public class PackageImport_1 {

	public PackageImport_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();

		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		a.main(new String[] {"call common package main()!!"});
		
	}

}
