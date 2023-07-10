package ch11_API.sec04_string;

/**
 * compareTo(): 사전순으로 나열했을 때, 두 객체의 비교(음수, 0, 양수)
 * 숫자값을 보지 말고, 부호만 봐라!
 */
public class Ex11_CompareTo {

	public static void main(String[] args) {
		String s1 = "Apple", s2 = "Banana";
		String s3 = new String("Apple");
		
		System.out.println(s1.compareTo(s2));		// -1 (A - B)
		System.out.println(s2.compareTo(s1));		// 1 (B - A)
		System.out.println(s1.compareTo(s3));		// 0 (A - A)

		Student st1 = new Student(1, "James");
		Student st2 = new Student(2, "Maria");
		Student st3 = new Student(3, "Brian");
		System.out.println(st1.compareTo(st2));		// -3 (J - M)
		System.out.println(st1.compareTo(st3));		// 8 (J - B)
	}

}