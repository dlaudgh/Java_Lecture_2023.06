package ch08_interface.sec01;

public class Main {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(5);
		tv.turnOff();
		
		RemoteControllable rc = new Audio();
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
	}

}
