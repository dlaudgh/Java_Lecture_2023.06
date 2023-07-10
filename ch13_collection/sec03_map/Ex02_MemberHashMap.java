package ch13_collection.sec03_map;

import java.util.HashMap;
import java.util.Map;

import ch13_collection.sec02_set.Member;

public class Ex02_MemberHashMap {

	public static void main(String[] args) {
		Member m1 = new Member(24, "James", "010-2345-6789");
		Member m2 = new Member(45, "James", "010-2345-6790");
		Member m3 = new Member(24, "Maria", "010-2345-6791");
		
		Map<Integer, Member> map = new HashMap<>();
		map.put(101, m1); 
		map.put(102, m2);
		map.put(103, m3);
		for (int key: map.keySet())
			System.out.println(key + " : " + map.get(key));
		
		Map<Member, Integer> map2 = new HashMap<>();
		map2.put(m1, 100);
		map2.put(m2, 200);
		map2.put(m3, 300);
		for (Member m: map2.keySet())
			System.out.println(m + " : " + map2.get(m));
		
		map.put(300, m1);	// 기존 key값과 다르므로 새로운 객체 추가
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		map2.put(m1, 500);	// m1이 key로 존재하므로 값만 바뀜
		map2.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
