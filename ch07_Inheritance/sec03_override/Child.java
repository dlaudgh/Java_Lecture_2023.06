package ch07_Inheritance.sec03_override;

/**
 * Method override(재정의)
 */
public class Child extends Parent {
	int childInt;
	
	void childMethod() {
		System.out.println(this.childInt);
	}
	
	@Override
	void parentMethod() {
		System.out.print("Parent: ");
		super.parentMethod();
		System.out.println("Child: " + this.childInt);
	}
}
