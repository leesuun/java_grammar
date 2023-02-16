package sec01_fileandcharset.EX06_ByteArrayToFromString;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class ByteArrayToFromString {

	public static void main(String[] args) throws UnsupportedCharsetException {
		// TODO Auto-generated method stub
	
		String originalStr = "테스트";
		byte[] bytes = null;
		try {
			bytes = originalStr.getBytes("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		originalStr = new String(bytes);

		String[] charSet = {"utf-8", "euc-kr", "ksc5601", "iso-8859-1", "x-windows-949", "MS949"};
		for(int i = 0; i<charSet.length; i++){
			for(int j = 0; j<charSet.length; j++){
				try{ 
					System.out.println("[" + charSet[i] + "," + charSet[j] + "]" + new String(originalStr.getBytes(charSet[i]), charSet[j]));
				} catch (UnsupportedEncodingException e){
					e.printStackTrace();
				}
			}
			System.out.println();
		}
		

	}

}
