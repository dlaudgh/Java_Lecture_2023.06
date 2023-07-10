package ch12_thread.sec02_multi_runnable;

public class Main {

	public static void main(String[] args) {
		Runnable beepTask = new BeepRunnable();
		Thread thread = new Thread(beepTask);
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
