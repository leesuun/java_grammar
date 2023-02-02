package sec04_userexception.EX01_CreateUserException;

class MyException extends Exception {

	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}

}

class A {
	MyException me1 = new MyException("에러나옴");

	void abc_1(int num) {
		try {
			if (num > 70) {
				System.out.println("정상 작동");
			} else {
				throw me1;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}
	
	void bcd_1() {
		abc_1(65);
	}
}

public class CreateUserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.bcd_1();

	}

}
