package ch04;

import java.util.Scanner;

public class Ex03_Alarm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시간 입력> ");
		int h = scan.nextInt();
		System.out.print("분 입력> ");
		int m = scan.nextInt();
		scan.close();
		
		if (m >= 45)
			System.out.println(h + "시 " + (m-45) + "분");
		else
		    System.out.println(((h+24-1)%24) + "시 " + (m+60-45) + "분");
		
//		int hour, minute, newHour, newMin;
//		Scanner scan = new Scanner(System.in);
//		hour = scan.nextInt();
//		minute = scan.nextInt();
//		scan.close();
//		
//		if (minute >= 45) {
//			newHour = hour;
//			newMin = minute - 45;
//		} else {
//			newHour = (hour + 24 - 1) % 24;
//			newMin = minute + 60 - 45;
//		}
//		System.out.printf("%02d:%02d", newHour, newMin);
	}

}
