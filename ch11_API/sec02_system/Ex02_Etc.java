package ch11_API.sec02_system;

public class Ex02_Etc {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		System.out.println(osName + ", " + userName);
		
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
	}

}
