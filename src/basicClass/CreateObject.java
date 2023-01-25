package basicClass;

import java.util.Arrays;

public class CreateObject {

	public CreateObject() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3 };
		array = modifyData(array);
		System.out.println(Arrays.toString(array));

	}

	public static int[] modifyData(int[] a) {
		int[] array = new int[] { 1, 2, 3 };
		for (int i = 0; i < array.length; i++) {
			a[i] = i + 4;
		}

		System.out.println(Arrays.toString(a));
		return array;
	}

}
