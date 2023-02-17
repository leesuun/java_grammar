package sec01_fileandcharset.EX01_CreateFileObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

public class CreateFileObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.printf("읽을 파일 경로: ");
		String FilePathAndName = sc.next();

		try {
			InputStream is = new FileInputStream(FilePathAndName);

			byte[] byteArray1 = new byte[9];
			int count;

			while ((count = is.read(byteArray1)) != -1) {
				String str = new String(byteArray1, 0, count, Charset.forName("UTF-8"));
				System.out.println(str);
				System.out.println(": count = " + count);

			}
			is.close();
			System.out.println();
			System.out.println();

			InputStream is2 = new FileInputStream(FilePathAndName);
			byte[] byteArray2 = new byte[9];
			int offset = 3;
			int length = 6;
			int count2 = is2.read(byteArray2, offset, length);
			System.out.println(new String(byteArray2, 0, offset + count2, Charset.forName("UTF-8")));
			System.out.println(new String(byteArray2, 0, offset + count2, Charset.forName("MS949")));
			is2.close();

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("IOException:" + e);
		}

		sc.close();

	}

}
