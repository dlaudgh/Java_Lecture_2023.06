package ch11_API.sec01_object;

public class Key {
	int number;
	
	Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key key = (Key) obj;
			return this.number == key.number;
		}
		return false;
	}
}
