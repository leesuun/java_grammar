package ExternalCallOperatorMethod;

import java.util.Scanner;


class Operator {
	int a = 0;
	int b = 0;

	int addition(int number_1, int number_2) {
		return number_1 + number_2;
	}

	int subtraction(int number_1, int number_2) {
		return number_1 - number_2;
	}

	int multiplication(int number_1, int number_2) {
		return number_1 * number_2;
	}

	int division(int number_1, int number_2) {
		return number_1 / number_2;
	}

	int remainder(int number_1, int number_2) {
		return number_1 % number_2;
	}

}

public class ExternalCallOperatorMethod {

	public ExternalCallOperatorMethod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operator operator = new Operator();
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		Integer number_1, number_2;
		String oper;

		try {
			System.out.printf("첫번째 수 입력: ");
			number_1 = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("number_1이 정수형이 아닙니다.");
			return;

		}

		try {
			System.out.printf("두번째 수 입력: ");
			number_2 = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("number_2이 정수형이 아닙니다.");
			return;

		}

		try {
			System.out.printf("연산자 입력: ");
			oper = scanner.next();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("oper이 스트링이 아닙니다.");
			return;

		}

		switch (oper) {

		case "+": {
			result = operator.addition(number_1, number_2);
			break;
		}
		case "-": {
			result = operator.subtraction(number_1, number_2);
			break;
		}
		case "*": {
			result = operator.multiplication(number_1, number_2);
			break;
		}
		case "/": {
			result = operator.division(number_1, number_2);
			break;
		}
		case "%": {
			result = operator.remainder(number_1, number_2);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + oper);
		}

		System.out.printf("%d %s %d = %d", number_1, oper, number_2, result);

	}

}
