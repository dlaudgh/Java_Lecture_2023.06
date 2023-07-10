package ch11_API.sec04_string;

public class Ex06_Replace {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어이고, 자바는 풍부한 API를 지원함.";
		String newStr = oldStr.replace("자바", "Java");
		
		System.out.println(newStr); 	// Java는 객체지향언어이고, Java는 풍부한 API를 지원함.
	}

}
