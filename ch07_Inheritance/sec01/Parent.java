package ch07_Inheritance.sec01;

public class Parent {
	int parentInt;
	
	Parent() {}
	Parent(int parentInt) {
		this.parentInt = parentInt;
	}
	
	void parentMetohd() {
		System.out.println(this.parentInt);
	}
}
