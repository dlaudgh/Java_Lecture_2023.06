package ch07_Inheritance.sec06_abstract2;

public class Sparrow extends Bird {
	public Sparrow() {
		this.kind = "참새";
	}

	@Override
	public void sound() {
		System.out.println("짹짹");
	}
}
