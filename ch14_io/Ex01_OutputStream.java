package ch14_io;

import java.io.*;

public class Ex01_OutputStream {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("c:/Temp/test.db");
			byte a = 10, b = 20;
			int c = 30;
			os.write(a);	// 1 byte
			os.write(b);	// 1 byte
			os.write(c);	// 1 byte, int type이지만 1 byte만 써짐
			
			byte[] array = {10, 20, 30, 40, 50};	// 5byte
			os.write(array);
			
			os.write(array, 1, 3);		// 3 byte
			
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
