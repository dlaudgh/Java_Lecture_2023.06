package ch02;

public class Ex02_Primitive {

	public static void main(String[] args) {
		// Literal
		int intLiteral = 30;
		int bitLiteral = 0b1001;	// 9
		int octal = 0377;			// 255
		int hexa = 0xff;			// 255
		long longVal = 256L;		// long literal
		System.out.printf("%d, %d, %d, %d, %d\n", intLiteral, bitLiteral, octal, hexa, longVal);
		
		char ga = '가';
		char capitalA = 0x41;
		System.out.printf("%c, %c\n", ga, capitalA);
		
		// 기본(primitive) 타입은 아니지만 기본처럼 사용되는 String
		String hello = "Hello World!";
		System.out.printf("%s\n", hello);
		
		// 실수: float, double
		double pi = 3.14;
		double mega = 1e6;
		float exp = 2.718f;		// float literal
		System.out.printf("%.2f, %.1f, %.3f\n", pi, mega, exp);
		
		// boolean
		boolean start = true, stop = false;
		System.out.printf("%s, %s\n", start, stop);
	}

}
