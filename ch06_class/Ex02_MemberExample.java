package ch06_class;

public class Ex02_MemberExample {

	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setName("James");
		member1.setAge(23);
		member1.setEmail("james@gmail.com");
		System.out.println(member1);
		
		Member member2 = new Member("Maria", 21, "maria@naver.com");
		System.out.println(member2);
		
		Member member3 = new Member("Brian", -30);
		System.out.println(member3);
		
		Member member4 = new Member("Tommy");
		System.out.println(member4);
		
		int totalAge = member1.getAge() + member2.getAge() + 
						member3.getAge() + member4.getAge();
		System.out.println(totalAge);
	}

}
