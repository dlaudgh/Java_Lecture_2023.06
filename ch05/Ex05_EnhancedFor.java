package ch05;

import java.util.Arrays;

public class Ex05_EnhancedFor {

	public static void main(String[] args) {
		String[] fruits = {"사과", "배", "딸기", "수박"};
		for (int i = 0; i < fruits.length; i++)
			System.out.print(fruits[i] + " ");
		System.out.println();
		
		// Enhanced For-loop
		for (String fruit: fruits) 
			System.out.print(fruit + " ");
		System.out.println();
		
		int score[][] = {{80, 90, 85}, {92, 76, 84}};
		for (int[] row: score)
			System.out.println(Arrays.toString(row));
		
		for (int[] row: score) {
			for (int element: row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
