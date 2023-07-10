package ch11_API.sec04_string;

public class Ex02_CharAt {

	public static void main(String[] args) {
		String s1 = "A quick brown fox";
		String s2 = "자바 프로그래밍";
		System.out.println(s1.charAt(3));	// u
		System.out.println(s2.charAt(3));	// 프
		
		String ssn = "010624-3203125";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자"); break;
		case '2':
		case '4':
			System.out.println("여자"); break;
		}
	}

}
