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
		System.out.print("��: ");
		int row = sc.nextInt();
		System.out.print("��: ");
		int col = sc.nextInt();

		System.out.printf("row: %d, col: %d\n", row, col);
		System.out.println("-----------------------");
		System.out.println("-----------------------");

		int[][] array = new int[row][col];
		int temp = 0;

		// �迭 ������� �ʱ�ȭ
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				array[i][j] = j + temp;
			}
			temp += col;
			System.out.println(Arrays.toString(array[i]));
		}
		System.out.println("-----------------------");

		// �迭 �������� �ʱ�ȭ
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
