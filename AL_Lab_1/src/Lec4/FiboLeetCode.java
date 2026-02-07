package Lec4;

public class FiboLeetCode {
    public static  int fib(int n) {
        int firstNum=0;
        int secondNum=1;
        for(int i=0;i<n;i++){
            int sum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=sum;
        }
        return firstNum;
    }
	public static void main(String[] args) {
		System.out.println(fib(6));
	}
}
