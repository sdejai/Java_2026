package Lec4;

import java.util.Scanner;

public class FiboSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nOrder=sc.nextInt(); //0 1 1 2 3 5 8//6
		int firstNum=0;
		int SecondNum=1;
		for(int i=0;i<=nOrder;i++) {// 0 1 1 2 3 
			System.out.print(firstNum+" ");
			int nextNumber=firstNum+SecondNum;
			firstNum=SecondNum;
			SecondNum=nextNumber;
		}
	}
}
