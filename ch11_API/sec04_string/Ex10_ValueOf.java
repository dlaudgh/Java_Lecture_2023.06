package ch11_API.sec04_string;

public class Ex10_ValueOf {

	public static void main(String[] args) {
		String num = String.valueOf(100);
		String num2 = "" + 100;
		System.out.println(num.equals(num2));	// true
	}

}
