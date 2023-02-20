package sec02_readerwriter.EX02_InputStreamReader_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class InputStreamReader_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * File inputStreamReader = new File("C:\\temp2\\InputStreamReader.txt");
		 * 
		 * try (Reader reader = new FileReader(inputStreamReader)) { int data; while
		 * ((data = reader.read()) != -1) { System.out.print((char) data); }
		 * 
		 * } catch (Exception e) { // TODO: handle exception System.out.println(e);
		 * 
		 * }
		 * 
		 * try (InputStream is = new FileInputStream(inputStreamReader);
		 * InputStreamReader isr = new InputStreamReader(is, "UTF-8")) { int data; while
		 * ((data = isr.read()) != -1) { System.out.print((char)data);
		 * 
		 * } System.out.println("\n" + isr.getEncoding());
		 * 
		 * } catch (Exception e) { // TODO: handle exception
		 * 
		 * }
		 */

		File outputStreamWriter1 = new File("C:\\temp2\\OutputStreamWriter1.txt");
		try (Writer writer = new FileWriter(outputStreamWriter1)) {
			writer.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			writer.write("한글과 영문이 모두 포함되 있습니다.");
			writer.write('\n');
			writer.write("Good BY1!!\n\n");
			writer.flush();

		} catch (Exception e) {
			// TODO: handle exception
		}

		File outputStreamWriter2 = new File("C:\\temp2\\OutputStreamWriter2.txt");
		try (OutputStream os = new FileOutputStream(outputStreamWriter2, false);
				OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8")) {

			osw.write("OutputStreamWriter1 예제파일입니다.\n".toCharArray());
			osw.write("한글과 영문이 모두 포함되 있습니다.");
			osw.write('\n');
			osw.write("Good BY1!!\n\n");
			osw.flush();
			System.out.println(osw.getEncoding());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
