package ch11_API.sec04_string;

public class Student implements Comparable {
	int sno;
	String name;
	
	Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public int compareTo(Object o) {
		// 이름을 기준으로 하면
		if (o instanceof Student) {
			Student s = (Student) o;
			return this.name.compareTo(s.name);
		}
		return 0;
	}
}
