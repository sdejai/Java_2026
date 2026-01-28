package Lec6;

public class TypeCasting {
	public static void main(String[] args) {
//		Widening Casting (Implicit)
		byte byNumber=123;
		int intNumber=byNumber;
		System.out.println(byNumber);
		System.out.println(intNumber);
	
		
//		Narrowing Casting (Explicit) 
		double doublNumber =12423.54d;
		float floatNumber =(float)doublNumber;
		System.out.println(doublNumber);
		System.out.println(floatNumber);
		float flaotNum=123234.543f;
		int intNum=(int)flaotNum;
		System.out.println(flaotNum);
		System.out.println(intNum);
	}
}
