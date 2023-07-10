package ch04;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex04_FullAge {

	public static void main(String[] args) {
		System.out.print("생년월일(yyyy-mm-dd)> ");
		Scanner scan = new Scanner(System.in);
		String[] birth = scan.nextLine().split("-");		// String array
		scan.close();
		
		int birthYear = Integer.parseInt(birth[0]);
		int birthMonth = Integer.parseInt(birth[1]);
		int birthDay = Integer.parseInt(birth[2]);
		System.out.printf("생년월일: %d-%02d-%02d\n", birthYear, birthMonth, birthDay);
		
		LocalDate today = LocalDate.now();
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();
		System.out.printf("오늘날짜: %d-%02d-%02d\n", tYear, tMonth, tDay);
		
		int age;
		if (tMonth < birthMonth)
			age = tYear - birthYear - 1;
		else if (tMonth > birthMonth)
			age = tYear - birthYear;
		else {
			if (tDay < birthDay)
				age = tYear - birthYear - 1;
			else
				age = tYear - birthYear;
		}
		System.out.println(age);
		
		}

}
