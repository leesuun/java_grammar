package stringPointer;

import java.util.*;

public class stringPtr {

	public stringPtr() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// ���ڿ� ����
//		String str1 = "Hello Java!";
//		String str2 = "�ȳ��ϼ���! �ݰ����ϴ�.";
//		System.out.println(str1.length());
//		System.out.println(str2.length());
//		str1.charAt(0);
//		for (int i = 0; i < str1.length(); i++) {
//			System.out.println(str1.charAt(i));
//		}
//		str1.indexOf(1);


		int[] order = { 0, 0, 0, 1, 0, 0, 1, 0 };
		Stack<Integer> intArr = new Stack<Integer>();

		
		for (int i = 0; i < order.length; i += 2) {
			if ((order[i] | order[i + 1]) == 0) {
				intArr.push(0);
			} else {
				intArr.push(1);
			}
		}
		System.out.println(intArr);
	}
}
