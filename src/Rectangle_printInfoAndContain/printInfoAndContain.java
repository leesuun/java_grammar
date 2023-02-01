package Rectangle_printInfoAndContain;

class Rectangle {
	private int x, y, width, height;

	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	int square() {
		return this.width * this.height;
	}

	void show() {
		System.out.printf("(%d, %d)���� ũ�Ⱑ %d * %d�� �簢��\n", x, y, width, height);
	}

	//sol2
	boolean contains(Rectangle r) {
		return (x < r.x && y < r.y) && ((x + width) > (r.x + r.width) && (y + height) > (r.y + r.height));
	}

}

public class printInfoAndContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		Rectangle d = new Rectangle(12, 12, 12, 12);
		Rectangle f = new Rectangle(2, 2, 2, 2);
		Rectangle g = new Rectangle(1, 1, 1, 1);

		r.show();
		System.out.println("s�� ������ " + s.square());
		if (t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if (t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");
		if (d.contains(t))
			System.out.println("d�� t�� �����մϴ�.");
		if (t.contains(f))
			System.out.println("t�� f�� �����մϴ�.");
		if (t.contains(g))
			System.out.println("t�� g�� �����մϴ�.");

	}

}
