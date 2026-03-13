package Lec25;

import java.util.Scanner;

public class CreateArray {
	public static void main(String[] args) {
		
		int arrInt[] =new int[6];
		System.out.println(arrInt.length);
		arrInt[0]=21;
		arrInt[1]=211;
		arrInt[2]=213;
		arrInt[3]=215;
		arrInt[4]=121;
		arrInt[5]=421;
//		System.out.print(arrInt[0]+" ");
//		System.out.print(arrInt[1]+" ");
//		System.out.print(arrInt[2]+" ");
//		System.out.print(arrInt[3]+" ");
//		System.out.print(arrInt[4]+" ");
//		System.out.print(arrInt[5]+" ");
		
		for(int index=0; index<arrInt.length; index++) {
			System.out.print(arrInt[index]+" ");
		}
		
		
	}
}
