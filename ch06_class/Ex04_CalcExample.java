package ch06_class;

public class Ex04_CalcExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int x = 10, y = 20;
		System.out.println("10 + 20 = " + calc.add(x, y));
		System.out.println("10 - 20 = " + calc.sub(x, y));
		System.out.println("10 * 20 = " + calc.mul(x, y));
		System.out.println("10 / 20 = " + calc.div(x, y));

	}

}
