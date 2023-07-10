package ch11_API.sec04_string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Ex04_GetBytes {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요?";
		
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length); 		// 16 (UTF-8로 encoding 되어 있음)
		System.out.println(new String(bytes1));
		System.out.println(Arrays.toString(bytes1));
		System.out.println();
		
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes2.length);		// 11 (EUC-KR encoding) 		
		System.out.println(new String(bytes2, "EUC-KR"));
		System.out.println(Arrays.toString(bytes2));
	}

}