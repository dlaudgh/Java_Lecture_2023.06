package ch12_thread.sec02_multi_runnable;

import java.awt.Toolkit;

public class BeepRunnable implements Runnable {

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
