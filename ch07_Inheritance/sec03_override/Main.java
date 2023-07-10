package ch07_Inheritance.sec03_override;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentInt = 1000;
		parent.parentMethod();
		
		Child child = new Child();
		child.childInt = 300;
		child.parentInt = 600;
		child.parentMethod();		// Child가 재정의한 메소드를 호출함
	}

}
