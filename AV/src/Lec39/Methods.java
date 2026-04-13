package Lec39;



public class Methods {
	
	public void sum(int num1,int num2) {
		int total=num1+num2;
		System.out.println(total);
	}
	public static void sub(int num1,int num2) {
		int totalSub=num1-num2;
		System.out.println(totalSub);
	}
	
	public static void main(String[] args) {
		Methods ms = new Methods();
		ms.sum(12,5);
		sub(10,7);
//		ms.sub(10,7);
	}
}
