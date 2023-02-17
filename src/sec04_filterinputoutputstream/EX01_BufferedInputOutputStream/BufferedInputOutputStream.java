package sec04_filterinputoutputstream.EX01_BufferedInputOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File orgfile = new File("C:\\temp2\\man.jpg");
		File copyfile1 = new File("C:\\temp2\\man_copy1.jpg");
		File copyfile2 = new File("C:\\temp2\\man_copy2.jpg");

		long start, end, time1, time2;

		start = System.nanoTime();
		try (InputStream is = new FileInputStream(orgfile); OutputStream os = new FileOutputStream(copyfile1);) {
			int data;
			while ((data = is.read()) != -1) {
				os.write(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without BufferedXXXStream: " + time1);
		start = System.nanoTime();
		try (InputStream is = new FileInputStream(orgfile);
				BufferedInputStream bis = new BufferedInputStream(is);
				OutputStream os = new FileOutputStream(copyfile2);
				BufferedOutputStream bos = new BufferedOutputStream(os);) {
			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("with bufferedXXXstream: " + time2 / 1000000000);
		System.out.println("ratio of with and without: " + (time1 / time2) / 1000000000);

	}

}
