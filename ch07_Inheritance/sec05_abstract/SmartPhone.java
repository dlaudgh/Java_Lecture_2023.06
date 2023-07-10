package ch07_Inheritance.sec05_abstract;

public class SmartPhone extends Phone {
	@Override
	void turnOn() {
		System.out.println("스마트폰 전원을 켭니다.");
	}
	@Override
	void turnOff() {
		System.out.println("스마트폰 전원을 끕니다.");
	}
	@Override
	public void call(String number) {
		System.out.println(number + "로 전화를 겁니다.");
	}
	
}
