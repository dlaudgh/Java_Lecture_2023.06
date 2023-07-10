package ch07_Inheritance.sec06_abstract2;

public class Main {

	public static void main(String[] args) {
		Cow cow = new Cow();
		System.out.println(cow.kind);
		cow.breathe();
		cow.sound();
		
		Pig pig = new Pig();
		System.out.println(pig.kind);
		pig.sound();
		
		// 자동 타입 변환
		Animal animal = cow;
		animal.sound();
		animal = pig;
		animal.sound();
		
		// 매개변수의 자동 타입 변환
		animalSound(cow);
		animalSound(pig);
		
		Bird bird = new Sparrow();
		bird.fly();
		bird.sound();
		animalSound(new Sparrow());
	}

	static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
