package Lec25;

import java.util.Scanner;

public class UserInputArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrInt[] =new int[5];
////		arrInt[0]=21;
//		arrInt[0]=sc.nextInt();
////		arrInt[1]=211;
//		arrInt[1]=sc.nextInt();
//		arrInt[2]=sc.nextInt();
//		arrInt[3]=sc.nextInt();
//		arrInt[4]=sc.nextInt();
		
		for(int index=0;index<arrInt.length;index++) {
			arrInt[index]=sc.nextInt();
		}
		
		for(int index=0;index<arrInt.length;index++) {
			System.out.print(arrInt[index]+" ");
		}
	}
}
