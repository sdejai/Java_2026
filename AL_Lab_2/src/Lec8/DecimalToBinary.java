package Lec8;

public class DecimalToBinary {
	public static void main(String[] args) {
		int num=10;
		int rem[]= new int[32];
		int i=0;
		while(num>0) {
			rem[i]=num%2;//0 1 1
			num=num/2;
			i++;
		}
		for(int index=i-1;index>=0;index--) {
			System.out.print(rem[index]);
		}
	}
}
