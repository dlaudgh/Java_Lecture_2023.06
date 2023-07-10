package ch13_collection.sec02_set;

import java.util.Objects;

public class Member {
	private int age;
	private String name;
	private String tel;
	
	public Member(int age, String name, String tel) {
		super();
		this.age = age;
		this.name = name;
		this.tel = tel;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + ", tel=" + tel + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Member))
			return false;
		Member mem = (Member) obj;
		return this.age == mem.getAge() && this.name.equals(mem.getName());
	}
}
