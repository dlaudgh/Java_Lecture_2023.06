package ch07_Inheritance.sec06_abstract2;

public class Cow extends Animal {
	public Cow() {
		this.kind = "소";
	}
	
	@Override
	public void sound() {
		System.out.println("음메~~");
	}
}
