package ch08_interface.sec03_Polymorphism;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		System.out.println();
		
		car.frontLeftTire = new KumhoTire();
		car.backRightTire = new HankookTire();
		car.run();
		System.out.println();
		
		car.changeFrontTire(new HankookTire());
		car.run();
	}

}
