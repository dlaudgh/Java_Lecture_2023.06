package ch14_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Ex10_File {

	public static void main(String[] args) throws IOException {
		File dir = new File("c:/Temp/images");
		File file = new File("c:/Temp/file.txt");
		
		if (!dir.exists())			// 디렉토리가 없으면
			dir.mkdirs();			// 디렉토리 생성
		if (!file.exists())			// 파일이 없으면
			file.createNewFile();	// 파일 생성
		
		// c:/Temp 디렉토리 검색
		File temp = new File("c:/Temp");
		File[] contents = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
		for (File f: contents) {
			System.out.printf("%-24s", sdf.format(f.lastModified()));
			if (f.isDirectory())
				System.out.printf("%-14s %-20s", "<DIR>", f.getName());
			else
				System.out.printf("%,14d %-20s", f.length(), f.getName());
			System.out.println();
		}
	}

}
