package ch08_interface.sec03_Polymorphism;

public class HankookTire implements Rollable {

	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
	
}
