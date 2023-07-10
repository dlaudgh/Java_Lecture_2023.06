package ch11_API.sec04_string;

public class Ex13_Join {

	public static void main(String[] args) {
		String fruits = "감, 배, 귤, 밤";
		String[] fruitArray = fruits.split(", ");
		String fruitStr = String.join(" -:- ", fruitArray);
		System.out.println(fruitStr);
		
		String paths = System.getenv("PATH");
		String[] pathArray = paths.split(";");
		
		String pathStr = String.join("\n", pathArray);
		System.out.println(pathStr);
	}

}
