package sec01_lamdaexpression.EX09_RefOfClassConstructor_1;

interface A1 {
	void abc(double k);
}

interface A2 {
	int abc(String str);
}

interface A3 {
	double abc(int k);
}

class A3B{
	 double bcd(int k) {
		return k * 0.1;
	}
	
}

public class practice_lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sol1
		A1 a1 = k -> System.out.println(k + 0.5);
		a1.abc(2.7);
		
		// sol2
		A2 a2 = new A2() { 
			@Override
			public int abc(String str) {
				// TODO Auto-generated method stub
				System.out.println(str.length());
				return str.length();
			}
		};
		a2.abc("12345");
		
		// sol3		
		A3B b3 = new A3B();
		A3 a3 = b3::bcd;
		

		
		
		

	}
}
