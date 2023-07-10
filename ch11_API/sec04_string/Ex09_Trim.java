package ch11_API.sec04_string;

public class Ex09_Trim {

	public static void main(String[] args) {
		String oldStr = "\t   자바 프로그래밍  \t \r\n";
		String newStr = oldStr.trim();
		
		System.out.println(newStr.length());
		System.out.println(newStr);
	}

}
