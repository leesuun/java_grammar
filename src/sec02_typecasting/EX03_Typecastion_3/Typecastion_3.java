package sec02_typecasting.EX03_Typecastion_3;

class A {

}

class B extends A {

}

public class Typecastion_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		A ab = new B();

		System.out.println(aa instanceof B);
		System.out.println(ab instanceof A);

		if (aa instanceof B) {
			B b = (B) aa;
			System.out.println("aa를 B로 캐스팅 했습니다.");
		} else {
			System.out.println("aa를 B로 캐스팅 불가능");
		}

		if ("안녕" instanceof String) {
			System.out.println("안녕을 String으로 캐스팅가능 String -> String");
		} else {
			System.out.println("안녕을 String으로 캐스팅 불가능");
		}

		if (new int[] { 1, 2, 3 } instanceof int[]) {
			System.out.println("[1,2,3]을 int[]로 캐스팅 가능");

		}

	}

}
