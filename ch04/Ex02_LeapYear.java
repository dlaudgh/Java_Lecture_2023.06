package ch04;

import java.util.Scanner;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		System.out.print("연도 입력> ");
		Scanner scan = new Scanner(System.in);
		int year = Integer.parseInt(scan.nextLine());
		scan.close();
		
		String result;
		if (year % 400 == 0)
			result = "윤년";
		else if (year % 100 == 0)
			result = "평년";
		else if (year % 4 == 0)
			result = "윤년";
		else
			result = "평년";
		System.out.println(year + "년은 " + result + "입니다.");
	
		if (year % 400 == 0)
			result = "윤년";
		else if (year % 4 == 0 && year % 100 != 0)
			result = "윤년";
		else
			result = "평년";
		System.out.println(year + "년은 " + result + "입니다.");
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			result = "윤년";
		else
			result = "평년";
		System.out.println(year + "년은 " + result + "입니다.");
		
		System.out.println(year + "년은 " + leapYear(year) + "입니다.");
	}

	private static String leapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return "윤년";
		return "평년";
	}
}
