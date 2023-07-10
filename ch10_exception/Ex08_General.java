package ch10_exception;

public class Ex08_General {

	public static void main(String[] args) {
		String str = null;
		int value = 0;
		
		try {
			str = args[0];
			value = Integer.parseInt(str);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println(value);
	}

}
