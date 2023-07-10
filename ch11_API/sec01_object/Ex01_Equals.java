package ch11_API.sec01_object;

public class Ex01_Equals {

	public static void main(String[] args) {
		Member m1 = new Member("james", "제임스");
		Member m2 = new Member("james", "제임수");
		Member m3 = new Member("james", "제임스");
		
		// Member에서 equals method를 재정의하기 이전 - 참조하는 주소로 비교
		System.out.println(m1.equals(m2));		// false
		System.out.println(m1.equals(m3));		// false
		
		Member2 nm1 = new Member2("james", "제임스");
		Member2 nm2 = new Member2("james", "제임수");
		Member2 nm3 = new Member2("james", "제임스");
		
		// Member2에서 equals method를 재정의 - id와 name이 같으면 동일
		System.out.println(nm1.equals(nm2));		// false
		System.out.println(nm1.equals(nm3));		// true
	}

}
