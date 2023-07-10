package ch06_class;

public class Member {
	// 속성, 필드
	private String name;
	private int age;
	private String email;
	
	// 생성자 함수
	public Member() { }
	public Member(String name) {
		this.name = name;
	}
	public Member(String name, int age) {
		this.name = name;
		if (age >= 0 && age <= 150)
			this.age = age;
	}
	public Member(String name, int age, String email) {
		this.name = name;
		if (age >= 0 && age <= 150)
			this.age = age;
		this.email = email;
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >= 0 && age <= 150)
			this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", email=" + email + "]";
	}
}