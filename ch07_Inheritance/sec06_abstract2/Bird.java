package ch07_Inheritance.sec06_abstract2;

public abstract class Bird extends Animal {
	public Bird() {
		this.kind = "조류";
	}
	
	public void fly() {
		System.out.println(this.kind + "가 날아간다.");
	}
}
