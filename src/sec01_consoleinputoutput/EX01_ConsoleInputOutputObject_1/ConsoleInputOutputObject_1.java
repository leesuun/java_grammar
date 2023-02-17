package sec01_consoleinputoutput.EX01_ConsoleInputOutputObject_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

public class ConsoleInputOutputObject_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream is = System.in;
		OutputStream os = System.out;

		byte[] byteArray1 = new byte[20];

		int count1 = is.read(byteArray1);
		String str1 = new String(byteArray1, 0, count1, Charset.forName("MS949"));
		System.out.println(str1);
		for (int i = 0; i < count1; i++) {
			System.out.print((char) byteArray1[i]);
		}
		System.out.println(": count = " + count1);
		System.out.println(Arrays.toString(byteArray1));
		
		System.out.println();
		System.out.println();
		
		
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');
		os.flush();
		
		byte[] byteArray2 = "HELLO!".getBytes();
		os.write(byteArray2);
		os.write('\n');
		os.flush();
		
		
	}

}
