package ch11_API.sec03_class;

public class Main {

	public static void main(String[] args) throws Exception {
		Car car = new Car("Model 3", "Tesla");
		Class clazz = car.getClass();
		System.out.println(clazz.getName());				// ch11_API.sec03_class.Car
		System.out.println(clazz.getSimpleName());			// Car
		System.out.println(clazz.getPackageName());			// ch11_API.sec03_class
		System.out.println(clazz.getPackage().getName());	// ch11_API.sec03_class
		System.out.println();
		
		clazz = Class.forName("ch11_API.sec03_class.Car");
		System.out.println(clazz.getName());				// ch11_API.sec03_class.Car
		System.out.println(clazz.getSimpleName());			// Car
		System.out.println(clazz.getPackageName());			// ch11_API.sec03_class
		System.out.println(clazz.getPackage().getName());	// ch11_API.sec03_class
		System.out.println();
		
		clazz = Car.class;
		System.out.println(clazz.getName());				// ch11_API.sec03_class.Car
		System.out.println();
		
		System.out.println(clazz.getResource("test.txt"));
	}

}
