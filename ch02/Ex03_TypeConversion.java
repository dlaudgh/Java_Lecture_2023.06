package ch02;

public class Ex03_TypeConversion {

	public static void main(String[] args) {
		// 자동 타입 변환(promotion): 작은 것에서 큰 것으로 갈 경우
		// byte -> short -> int -> long -> float -> double
		short a = 256;
		int b = a;		// 자동 타입 변환
		long c = b;		// 자동 타입 변환
		float d = c;	// 자동 타입 변환
		double e = d;	// 자동 타입 변환
		System.out.printf("%d, %d, %.1f, %.1f\n", b, c, d, e);
		
		// 강제 타입 변환(casting)
		long f = 250L;
		int g = (int) f;
		short h = (short) g;
		double i = 3.14;
		float j = (float) i;
		System.out.printf("%d, %.2f\n", h, j);
		
		int k = (int) i;		// 3.14 -> 3
		
		// 연산에서의 자동타입 변환
		long l = a + b + c;		// short + int + long -> long
		double m = l + 1024.5f;	// long + float -> double
		double n = a / b;		// 정수 / 정수 -> double
		System.out.printf("%d, %.2f, %.1f\n", l, m, n);
		
		// 문자열 자동 타입 변환
		int o = 3 + 7;
		String p = "3" + 7;		// "37"
		String q = "3" + "7";	// "37"
		String r = "pi값은 " + 3.14f;		// String + float -> String
		String s = 1 + 2 + "3";				// 33, 연산이 왼쪽에서 오른쪽으로 순차적 수행
		System.out.printf("%d, %s, %s, %s, %s\n", o, p, q, r, s);
		
		// 문자열 -> 기본 타입으로 강제 변환
		int t = Integer.parseInt("123456");
		long u = Long.parseLong("123456789000");
		double v = Double.parseDouble("3.1415926535");
		System.out.printf("%,d, %,d, %.10f\n", t, u, v);
		
		// 기본 타입 -> 문자열
		String w = String.valueOf(123);
		String x = String.valueOf(3.1415926535);
		System.out.printf("%s, %s\n", w, x);
	}

}
