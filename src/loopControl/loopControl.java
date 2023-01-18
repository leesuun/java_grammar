package loopControl;

public class loopControl {

	public loopControl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q3
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

		// Q4
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i -= 2;
		}
		i = 10;

		do {
			System.out.println(i);
			i -= 2;
		} while (i > 0);

	}

}
