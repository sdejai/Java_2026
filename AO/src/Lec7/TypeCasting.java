package Lec7;

public class TypeCasting {
	public static void main(String[] args) {
		byte byteNumber =121;
		long longNumber =byteNumber;
		System.out.println(byteNumber);
		System.out.println(longNumber);
		
		int intNumber =1312;
		short shortNumber=(short)intNumber;
		System.out.println(intNumber);
		System.out.println(shortNumber);
		
		
		
		float floatNumber =1232.33f;
		int intNumber1=(int)floatNumber;
		System.out.println(floatNumber);
		System.out.println(intNumber1);
		
		double doubleNum=2141.343d;
		int intnum=(int)doubleNum;
		float floatnum=(float)doubleNum;
		System.out.println(doubleNum);
		System.out.println(intnum);
		System.out.println(floatnum);
	}
}
