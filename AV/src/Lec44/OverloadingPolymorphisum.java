package Lec44;

public class OverloadingPolymorphisum {
	public int sum(int num1,int num2) {
		return num1+num2;
	}
	public void sum(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public void sum(int num1,float num2) {
		System.out.println(num1+num2);
	}
	public void sum(float num1,float num2) {
		System.out.println(num1+num2);
	}
	public void sum(float num1,int num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		OverloadingPolymorphisum obj = new OverloadingPolymorphisum();
		System.out.println(obj.sum(12, 2));
	}
}
