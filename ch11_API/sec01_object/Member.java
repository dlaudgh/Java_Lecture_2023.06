package ch11_API.sec01_object;

public class Member {
	String id;
	String name;
	
	Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	} 
}
