package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex04_Performance {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		
		// ArrayList 앞에 10000회 추가하는 경우
		long startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			al.add(0, String.valueOf(i));
		long endTime = System.nanoTime();
		System.out.println("ArrayList 소요시간: " + (endTime - startTime) + " ns");
				
		// LinkedList 앞에 10000회 추가하는 경우
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++)
			ll.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간: " + (endTime - startTime) + " ns");
		System.out.println("=====================");
				
		// ArrayList 뒤에 100000회 추가하는 경우
		startTime = System.nanoTime();
		for (int i=0; i<100000; i++)
			al.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요시간: " + (endTime - startTime) + " ns");
		
		// LinkedList 뒤에 1000000회 추가하는 경우
		startTime = System.nanoTime();
		for (int i=0; i<1000000; i++)
			ll.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간: " + (endTime - startTime) + " ns");
	}

}
