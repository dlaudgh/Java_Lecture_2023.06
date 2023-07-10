package ch14_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03_Copy {

	public static void main(String[] args) throws Exception {
		String srcFile = "c:/Temp/고양이.jpg";
		String dstFile = "c:/Temp/cat.jpg";
		
		InputStream is = new FileInputStream(srcFile);
		OutputStream os = new FileOutputStream(dstFile);
		
		byte[] data = new byte[1024];	// 1024 = 1KB
		while (true) {
			int num = is.read(data);	// 읽었으면 읽은 데이터 갯수, 없으면 -1 return
			if (num == -1)
				break;
			os.write(data, 0, num);
		}
		
		os.flush(); os.close(); is.close();
		System.out.println("복사가 끝났습니다.");
	}

}
