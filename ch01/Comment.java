package ch01;

public class Comment {
	/**
	 * 도큐먼트 주석 - API document 만들때 사용
	 * @param args
	 */
	public static void main(String[] args) {
		// In-line comment
		/* 주석 */
		/*
		 * 여러줄의 주석
		 */
		// 프로그램의 시작 위치
		System.out.println("실행문 뒤에는 세미콜론(;)을 붙여야 함");
		int x = 1;
		int y = 2;
		int sum = x + y;
		System.out.println("결과는 " + sum + " 입니다.");
	}

}
