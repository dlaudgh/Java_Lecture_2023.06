package ch14_io;

import java.io.FileReader;
import java.io.Reader;

public class Ex05_Reader {

	public static void main(String[] args) throws Exception {
		Reader reader = null;
		
		// 1문자씩 읽기
		reader = new FileReader("c:/Temp/test.txt");
		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			System.out.print((char) data);
		}
		reader.close();
		System.out.println();
		
		// 문자 배열로 읽기
		reader = new FileReader("c:/Temp/test.txt");
		char[] buffer = new char[100];
		while (true) {
			int num = reader.read(buffer);		// num은 읽은 문자수
			System.out.println(num);
			if (num == -1)
				break;
			for (int i=0; i<num; i++)
				System.out.print(buffer[i]);
			System.out.println();
		}
		reader.close();
	}

}