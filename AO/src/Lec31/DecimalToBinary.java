package Lec31;

public class DecimalToBinary {
	public static void main(String[] args) {
		int decimalNum=15;
		int rem[] = new int[32];
		int i=0;
		while(decimalNum!=0) {
			rem[i]=decimalNum%2;
			decimalNum=decimalNum/2;
			i++;
		}
		for(int index=i-1;index>=0;index-- ) {
			System.out.print(rem[index]);
		}
		
	}
}
