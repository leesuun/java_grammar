package sec02_exceptionhandlingsyntax.EX04_MultiCatch_3;

public class MultiCatch_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생");

		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 예외 발생");

		} finally {
			System.out.println("final");
		}

		try {
			System.out.println(3 / 0);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e);
		}
	}

}
