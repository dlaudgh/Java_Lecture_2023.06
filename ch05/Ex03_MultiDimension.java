package ch05;

import java.util.Arrays;

public class Ex03_MultiDimension {

	public static void main(String[] args) {
		int[][] matrix = new int[2][3];
		int score[][] = {{80, 90, 85}, {92, 76, 84}};
		
		System.out.printf("%d, %d\n", score[0][0], score[1][2]);
		
		// 행의 갯수, 열의 갯수
		System.out.printf("%d, %d\n", matrix.length, matrix[0].length);		// 2, 3
		
		System.out.println(Arrays.toString(score));		// 도움 안됨
		System.out.println(Arrays.toString(score[0]));
		System.out.println(Arrays.toString(score[1]));
	}

}
