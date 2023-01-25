package sec_02_method.EX07_FlexibleSizeArrayArgument;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public FlexibleSizeArrayArgument() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1(1, 2, 3, 4);
		System.out.println();
		method2("1", "2", "3", "4");
		System.out.println();
		method2("1", "2");
		System.out.println();
		method2(new String[] { "1", "2", "3" });

	}

	public static void method1(int... values) {
		int[] arr = values;
		for (int value : arr) {
			System.out.println(value);
		}
	}

	public static void method2(String... values) {
		String[] arr = values;
		for (String value : arr) {
			System.out.println(value);
		}
	}
}
