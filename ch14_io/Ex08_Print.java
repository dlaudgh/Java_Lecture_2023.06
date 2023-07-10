package ch14_io;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex08_Print {

	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream(new FileOutputStream("c:/Temp/print.txt"));
		
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것 처럼");
		ps.println("데이터를 출력합니다.");
		ps.printf("%-6s%,8d\n", "참외", 3000);
		ps.printf("%-6s%,8d\n", "수박", 10000);
		
		ps.flush(); ps.close();
	}

}
