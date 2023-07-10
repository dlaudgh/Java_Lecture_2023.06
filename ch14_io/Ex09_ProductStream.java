package ch14_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Ex09_ProductStream {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/Temp/product.dat"));
		
		Product p = new Product("노트북", 1200000);
		int[] arr = {10, 11, 12};
		
		oos.writeObject(p); oos.writeObject(arr);
		oos.flush(); oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/Temp/product.dat"));
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();
		ois.close();
		
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
	}

}
