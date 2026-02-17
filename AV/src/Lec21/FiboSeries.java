package Lec21;

import java.util.Scanner;

public class FiboSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int fisrtNumber=0;
		int secNum=1;
		for(int i=0;i<=n;i++) {
			System.out.print(fisrtNumber+" ");
			int sum=fisrtNumber+secNum;
			fisrtNumber=secNum;
			secNum=sum;
		}
		
	}
}
