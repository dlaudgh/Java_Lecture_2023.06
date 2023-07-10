package ch06_class;

import java.time.LocalDate;

public class Customer {
	private int cid;
	private String name;
	private int age;
	private LocalDate regDate;
	private boolean adult;
	
	public Customer() { }
	public Customer(int cid, String name, int age) {
		this(cid, name, age, LocalDate.now());
	}
	public Customer(int cid, String name, int age, LocalDate regDate) {
		this.cid = cid;
		this.name = name;
		if (age >= 0 && age <= 150)
			this.age = age;
		this.regDate = regDate;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
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
		this.age = age;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	public boolean isAdult() {			// boolean type의 getter의 이름은 isField()
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", regDate=" + regDate + ", adult=" + adult
				+ "]";
	}
}
