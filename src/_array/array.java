package _array;

import java.util.Arrays;

public class array {

	public array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] front = new int[5];
		int[] back = new int[5];

		int j = 0;
		for (int i = 0; i < front.length + back.length; i++) {
			if (i < 5) {
				front[i] = i;
			} else {
				back[j] = i;
				j++;
			}
		}
		// array copy
		int[] dest = new int[front.length + back.length];
		int copyLength = 5;

		System.arraycopy(front, 0, dest, 0, copyLength);
		System.arraycopy(back, 0, dest, 5, copyLength);
		System.out.println(Arrays.toString(dest));

//		

	}
}
