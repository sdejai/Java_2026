package Lec10;

public class Demo implements InterfaceDemo{

	@Override
	public void sum(int num1, int num2) {
		System.out.println(num1+num2);
		
	}

	@Override
	public void multiply(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.sum(12, 1);
	}

}
