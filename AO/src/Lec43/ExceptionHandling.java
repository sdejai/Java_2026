package Lec43;

import java.io.FileReader;

public class ExceptionHandling {
	public static void main(String[] args) {
		
//		try
//		catch
//		throw
//		throws
//		finally
		
//		FileReader obj = new FileReader("/a.text");
		
		
//		int arr[]=new int[4];
//		System.out.println(arr[5]);
		String name=null;
		System.out.println("Hello class");
		try {
			int result=10/0;
			System.out.println(result);
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
		
//		try {
//			System.out.println(name.length());
//		}catch (Exception e) {
//			System.out.println(e);
//		}
		
		System.out.println("Hey");
		System.out.println("Hello");
	}
}
