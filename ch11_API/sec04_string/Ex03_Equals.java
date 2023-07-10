package ch11_API.sec04_string;

public class Ex03_Equals {

	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = new String("홍길동");
		
		// 참조하는 객체의 주소가 같은지를 비교
		System.out.println(s1 == s2);	// true
		System.out.println(s1 == s3);	// false
		
		// String은 문자열이 같은지를 비교해야 함
		System.out.println(s1.equals(s2));	// true
		System.out.println(s1.equals(s3));	// true
	}

}
