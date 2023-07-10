package ch10_exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex05_FileExample {

	public static void main(String[] args) {
		String key = null;
		try {
			FileReader fr = new FileReader("C:/Users/YONSAI/Downloads/roadapikey.txt");
			BufferedReader br = new BufferedReader(fr);
			key = br.readLine();
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(key);
	}

}
