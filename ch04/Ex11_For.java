package ch04;

import java.util.Scanner;

public class Ex11_For {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++)
			sum += i;
		System.out.println("1 ~ 100 합: " + sum);
		
		int oddSum = 0;
		for (int i = 1; i <= 100; i += 2)
			oddSum += i;
		System.out.println("1 ~ 100 홀수 합: " + oddSum);
		
		int divSum = 0, num = 24;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				divSum += i;
			}
		}
		System.out.println("\n" + num + " 약수 합: " + divSum);
		
		// 사용자가 5번 입력한 문자열을 받아서, 공백을 사이에 넣고
		// 하나의 문자열로 만들기
		Scanner scan = new Scanner(System.in);
		String text = "";
		for (int i = 0; i < 5; i++) {
			System.out.print("입력> ");
			String line = scan.nextLine();
			text += line + " ";
		}
		scan.close();
		System.out.println(text);
		
		
	}

}
