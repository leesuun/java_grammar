package basicClass;

import java.util.Arrays;

public class CreateObject {

	public CreateObject() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] originArray = new int[] { 1, 2, 3 };
		int[] originCopyArray;

//		int[] originCopyArray_2 = new int[] { 4, 5, 6 };
		originCopyArray = modifyData(originArray);

//		System.out.println(originCopyArray_2);
		System.out.println("연산된 배열: " + Arrays.toString(originArray) + " " + "연산된 배열 주소: " + originArray);
		System.out.println("원본 복사된 배열: " + Arrays.toString(originCopyArray) + " " + "원본 복사된 주소: " + originCopyArray);
	}

	public static int[] modifyData(int[] a) {
		int[] array = new int[] { 1, 2, 3 };
		for (int i = 0; i < array.length; i++) {
			a[i] = i + 4;
		}
		return array;
	}

}
