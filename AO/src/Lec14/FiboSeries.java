package Lec14;

import java.util.Scanner;

public class FiboSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nOrder=sc.nextInt();
		int firstNum=0;
		int seondNum=1;
		for(int i=0;i<nOrder;i++) {
//			System.out.print(firstNum+" ");
			int sum=firstNum+seondNum;
			firstNum=seondNum;
			seondNum=sum;
		}
		System.out.print(firstNum+" ");
	}
}
