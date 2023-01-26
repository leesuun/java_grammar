package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class A {
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;

	public void print() {
		System.out.println(a + " ");
		System.out.println(b + " ");
		System.out.println(c + " ");
		System.out.println(d);
		System.out.println();

	}
}
