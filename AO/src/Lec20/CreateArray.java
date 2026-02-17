package Lec20;

import java.util.Scanner;

public class CreateArray {
	public static void main(String[] args) {
		float arr[]=new float[5];
		arr[0]=1.2f;
		arr[1]=23.4f;
		arr[2]=2.4f;
		arr[3]=2344.4f;
		arr[4]=3.4f;
//		System.out.println(arr[3]);
//		System.out.println(arr[0]);
		
		int arrInt[]=new int[3];
		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
//		arrInt[0]=sc.nextInt();
//		arrInt[1]=sc.nextInt();
//		arrInt[2]=sc.nextInt();
		
		for(int i=0;i<3;i++) {
			arrInt[i]=sc.nextInt();
		}
			
		
		
		System.out.println(arrInt[0]);
		System.out.println(arrInt[1]);
		System.out.println(arrInt[2]);
	}
}
