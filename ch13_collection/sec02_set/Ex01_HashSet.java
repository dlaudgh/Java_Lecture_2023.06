package ch13_collection.sec02_set;

import java.util.HashSet;
import java.util.Set;

public class Ex01_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// 객체 저장
		set.add("Java"); set.add("JSP"); set.add("JDBC"); set.add("Servlet");
		set.add("Java");	// 중복 객체이므로 저장되지 않음
		
		System.out.println(set.size());
		
		for (String str: set)
			System.out.println(str);
		
		System.out.println(set.contains("JSP"));
		
		// 객체 삭제
		set.remove("JSP");
		System.out.println(set.contains("JSP"));
	}

}
