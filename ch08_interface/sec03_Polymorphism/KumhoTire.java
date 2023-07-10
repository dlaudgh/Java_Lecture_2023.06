package ch08_interface.sec03_Polymorphism;

public class KumhoTire implements Rollable {

	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}

}
