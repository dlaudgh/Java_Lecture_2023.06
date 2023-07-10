package ch10_exception;

public class Ex06_TryCatch {

	public static void main(String[] args) {
		String str = null;
		try {
			str = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("사용법: 매개변수를 입력하세요.");
		}
		System.out.println(str);
		
		int value = 0;
		try {
			value = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("잘못된 숫자형식입니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		System.out.println(value);
	}

}
