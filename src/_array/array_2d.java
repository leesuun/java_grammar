package _array;

import java.util.Arrays;
import java.util.Scanner;

public class array_2d {

	public array_2d() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("행: ");
		int row = sc.nextInt();
		System.out.print("열: ");
		int col = sc.nextInt();

		System.out.printf("row: %d, col: %d\n", row, col);
		System.out.println("-----------------------");
		System.out.println("-----------------------");

		int[][] array = new int[row][col];
		int temp = 0;

		// 배열 순서대로 초기화
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = j + temp;
			}
			temp += col;
			System.out.println(Arrays.toString(array[i]));
		}
		System.out.println("-----------------------");

		// 배열 역순으로 초기화
		temp = row * col;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = temp - j;
			}
			temp -= col;
			System.out.println(Arrays.toString(array[i]));
		}

	}

}
