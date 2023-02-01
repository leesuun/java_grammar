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
		System.out.printf("(%d, %d)에서 크기가 %d * %d인 사각형\n", x, y, width, height);

	}

	boolean contains(Rectangle r) {
		final boolean a = (x < r.x && y < r.y);
		final boolean b = ((x + width) > (r.x + r.width) && (y + height) > (r.y + r.height));

		// isTopLeftOfCurrentWithinBoundsOfR
		// isBottomRightOfCurrentBeyondBoundsOfR
		
		if (a && b) {
			return true;
		}

		return false;
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

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s을 포함합니다.");
		if (d.contains(t))
			System.out.println("d는 t을 포함합니다.");
		if (t.contains(f))
			System.out.println("t는 f을 포함합니다.");

	}

}
