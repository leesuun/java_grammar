package sec01_fileandcharset.EX01_CreateFileObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CreateFileObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.printf("찾을 파일의 경로와 파일 이름 입력: ");
		String FilePathAndName = sc.next();

		try {
			InputStream is = new FileInputStream(FilePathAndName);
			int data;

			while ((data = is.read()) != -1) {

				System.out.println("읽은 데이터: " + (char) data + " 남은 바이트 수: " + is.available());
			}
			is.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException:" + e);
		}

		sc.close();

	}

}
