package ch07_Inheritance.sec01;

public class Child extends Parent {
	int childInt;
	
	Child() {}
	Child(int childInt) {
		this.childInt = childInt;
	}
	
	void childMethod() {
		System.out.println(this.childInt);
	}
}
