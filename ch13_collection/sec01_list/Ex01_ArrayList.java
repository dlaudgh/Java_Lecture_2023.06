package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JSP");
		list.add("Servlet");
		
		System.out.println(list.get(0));	// Java
		System.out.println(list.get(2));	// Servlet
		System.out.println(list.size());	// 3
		
		// 일반적인 For-loop
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// Enhanced For-loop
		for (String element: list)
			System.out.print(element + " ");
		System.out.println();
		
		// Stream과 Lambda 함수로 처리
		list.forEach(x -> System.out.print(x + " "));	// lambda x : print(x)
		System.out.println();
		
		list.remove(1);
		list.add("JDBC");
		list.add("Spring");
				
		list.forEach(x -> System.out.println(x + " "));
		
		System.out.println(list.isEmpty());
		System.out.println(list.contains("Spring"));
		
		list.clear();
		System.out.println(list.isEmpty());
	}

}

