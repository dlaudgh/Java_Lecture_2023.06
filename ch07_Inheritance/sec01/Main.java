package ch07_Inheritance.sec01;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		parent.parentInt = 1000;
		parent.parentMetohd();
		
		child.childInt = 300;
		child.childMethod();
		
		// child가 상속받은 parent의 속성/메소드 이용
		child.parentInt = 2000;
		child.parentMetohd();
		
		// child가 상속받은 Parent instance와 parent instance는 다르다.
		parent.parentMetohd();
	}

}
