package ch12_thread.sec03_multi_thread;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);			// 1000 ms 만큼 중지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 		
		}
	}
	
}
