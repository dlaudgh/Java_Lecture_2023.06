package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03_ArraysAsList {

	public static void main(String[] args) {
		// Array --> List
		String[] fruits = {"Apple", "Banana", "Cherry"};
		List<String> fruitList = Arrays.asList(fruits);
		for (String fruit: fruitList)
			System.out.println(fruit);
		
		// List를 쉽게 만드는 방법
		List<Integer> scoreList = Arrays.asList(80, 90, 94, 76);
		for (int score: scoreList)
			System.out.println(score);
		System.out.println("==========");
		
		scoreList = generateScore(5);
		for (int score: scoreList)
			System.out.println(score);
	}

	private static List<Integer> generateScore(int count) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			int score = (int)(Math.random() * 40) + 60;
			list.add(score);
		}
		return list;
	}
}
