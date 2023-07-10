package ch07_Inheritance.sec02;

/**
 * 부모의 생성자 호출
 */
public class Child extends Parent {
	int childInt;
	
	Child() {}
	Child(int childInt) {
		super(childInt * 2);	// 부모 생성자 호출
		this.childInt = childInt;
	}
	
	void childMethod() {
		System.out.println(this.childInt);
	}
}
