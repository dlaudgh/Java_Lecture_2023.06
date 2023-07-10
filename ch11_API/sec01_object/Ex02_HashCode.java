package ch11_API.sec01_object;

import java.util.HashMap;
import java.util.Map;

public class Ex02_HashCode {

	public static void main(String[] args) {
		Key key1 = new Key(3);
		Key key2 = new Key(3);
		System.out.println(key1.equals(key2));
		System.out.println(key1.hashCode() + ", " + key2.hashCode());
		
		// hashCode() 메소드를 재정의 하기 이전
		Map<Key, String> hashMap = new HashMap();
		hashMap.put(key1, "James");
		hashMap.put(key2, "Maria");
		System.out.println(hashMap.get(key1));
		System.out.println(hashMap.get(key2));
		System.out.println("======");
		
		// hashCode()를 재정의한 후
		Map<Key2, String> hashMap2 = new HashMap();
		Key2 key21 = new Key2(3);
		Key2 key22 = new Key2(3);
		System.out.println(key21.hashCode() + ", " + key22.hashCode());
		
		hashMap2.put(key21, "James");	// HashMap은 key가 중복되면 값을 새로이 저장하지 않음
		hashMap2.put(key22, "Maria");	// 기존 key가 가리키는 value를 변경함
		System.out.println(hashMap2.get(key21));	// Maria
		System.out.println(hashMap2.get(key22));	// Maira
	}

}
