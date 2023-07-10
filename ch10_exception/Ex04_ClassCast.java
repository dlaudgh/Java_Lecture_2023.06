package ch10_exception;

public class Ex04_ClassCast {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		Cat cat;
		Dog dog;
		// cat = (Cat) a1;		// 좋은 방법이 아님
		// dog = (Dog) a2;
		
		if (a1 instanceof Cat)
			cat = (Cat) a1;
		if (a2 instanceof Dog)
			dog = (Dog) a2;
	}

}

class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}