package ex05.calc_04;

public abstract class Calc {
	protected int a, b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public abstract int calculate();
}

class Sum extends Calc {

	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc {

	public int calculate() {
		return a - b;

	}
}

class Mul extends Calc {

	public int calculate() {
		return a * b;
	}
}

class Div extends Calc {

	public int calculate() {
		return a / b;
	}
}
