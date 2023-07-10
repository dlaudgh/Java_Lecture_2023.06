package ch13_collection.sec01_list;

/**
 * 나이의 내림차순으로 1차 정렬
 * 나이가 같으면 이름의 오름차순으로 정렬
 */
public class Member implements Comparable {
	private int age;
	private String name;
	
	public Member(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		Member m = (Member) o;
		if (this.age > m.getAge())
			return -1;
		else if (this.age < m.getAge())
			return 1;
		else
			return this.name.compareTo(m.getName());
	}
}
