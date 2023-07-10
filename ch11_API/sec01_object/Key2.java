package ch11_API.sec01_object;

import java.util.Objects;

public class Key2 {
	int number;
	String name;
	
	Key2(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key2) {
			Key2 key = (Key2) obj;
			return this.number == key.number;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// return number;
		return Objects.hash(number);
		// return Objects.hash(number, name);	// hashCode() 값을 만들때 사용하는 필드를 매개변수로 전달하면 됨
	}
}
