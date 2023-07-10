package ch11_API.sec02_system;

public class Ex01_Time {

	public static void main(String[] args) {
		long milliTime = System.currentTimeMillis();	// 1970-01-01 00:00:00 기준 이후 밀리초
		System.out.println(milliTime);
		long startTime = System.nanoTime();
		int sum = 0;
		for (int i = 1; i < 100000; i++)
			sum += i;
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}

}
