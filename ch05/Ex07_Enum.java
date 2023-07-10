package ch05;

import java.time.LocalDate;

public class Ex07_Enum {
	public enum Week {MON, TUE, WED, THU, FRI, SAT, SUN};
	
	public static void main(String[] args) {
		Week date = Week.THU;
		System.out.println(date.name());
		System.out.println(date.ordinal());
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getDayOfWeek());
	}

}
