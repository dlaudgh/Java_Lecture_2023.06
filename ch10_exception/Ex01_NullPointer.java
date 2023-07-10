package ch10_exception;

public class Ex01_NullPointer {

	public static void main(String[] args) {
		String str = null;
		// str = "Java";
		
		// System.out.println(str.length());
		
		if (str != null)
			System.out.println(str.length());
	}

}
