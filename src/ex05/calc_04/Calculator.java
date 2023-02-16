package ex05.calc_04;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner;
		while (true) {
			scanner = new Scanner(System.in);
			Integer number_1 = 0, number_2 = 0;
			Character oper = ' ';

			System.out.println("연산 입력 ex) 1 1 +");
			try {
				number_1 = scanner.nextInt();
				number_2 = scanner.nextInt();
				oper = scanner.next().charAt(0);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("연산식 입력 오류");
			}

			Calc exp;

			switch (oper) {
			case '+':
				exp = new Sum();
				break;
			case '-':
				exp = new Sub();
				break;
			case '*':
				exp = new Mul();
				break;
			case '/':
				exp = new Div();
				break;
			default:
				System.out.println("계산기 종료");
				scanner.close();
				return;
			}
			exp.setValue(number_1, number_2);
			System.out.println(exp.calculate());
			if (exp instanceof Div && exp.b == 0) {
				System.out.println("0으로 나눌 수 없슴다.");			

			}

		}

	}

}
