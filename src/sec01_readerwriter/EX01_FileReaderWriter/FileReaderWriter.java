package sec01_readerwriter.EX01_FileReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File readerWriteFile = new File("C:\\temp2\\readerWriterFile.txt");
		/*
		 * try (Writer writer = new FileWriter(readerWriteFile)) {
		 * writer.write("æ»≥Á«œººø‰\n".toCharArray()); writer.write("Hello");
		 * writer.write('\r'); writer.write('\n'); writer.write("π›∞©Ω¿¥œ¥Ÿ.", 2, 3);
		 * writer.flush(); } catch (Exception e) { // TODO: handle exception try (Reader
		 * reader = new FileReader(readerWriteFile)) { int data; while ((data =
		 * reader.read()) != -1) { System.out.println((char) data); } } catch (Exception
		 * e2) { // TODO: handle exception } }
		 * 
		 * try (Reader reader = new FileReader(readerWriteFile)) { int data; while
		 * ((data = reader.read()) != -1) { System.out.print((char) data); }
		 * 
		 * } catch (Exception e) { // TODO: handle exception }
		 */

		try (Writer writer = new FileWriter(readerWriteFile); BufferedWriter bw = new BufferedWriter(writer)) {
			bw.write("æ»≥Á«œººø‰\n".toCharArray());
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("π›∞©Ω¿¥œ¥Ÿ.", 2, 3);
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

		try (Reader reader = new FileReader(readerWriteFile); BufferedReader br = new BufferedReader(reader)) {
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
