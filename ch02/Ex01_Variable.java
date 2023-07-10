package ch02;

public class Ex01_Variable {

	public static void main(String[] args) {
		int age;
		age = 21;
		int value = 80;
		int score = value * 2;	// 변수를 선언하면서 초기화를 동시에 해주는 것을 권장
		System.out.println("age: " + age + ", score: " + score);
		
		int x = 10, y = 20;
		// x와 y의 값을 바꾸고 싶을 때
		int tmp = x;
		x = y;
		y = tmp;
		
		if (score > 100) {
			int localVar = 10;	// if block 안에서만 사용할 수 있는 변수
			// int value = 20;	// local 변수 value가 이미 존재하므로 사용할 수 없음
			System.out.println(localVar);
		}
		// 여기에서는 localVal를 사용할 수 없음
	}

}
