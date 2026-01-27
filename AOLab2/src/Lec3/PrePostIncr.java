package Lec3;

public class PrePostIncr {
	public static void main(String[] args) {
		int preNumber=5;
		System.out.println(++preNumber);//6
		System.out.println(preNumber++);//6
		System.out.println(preNumber);//7
		preNumber++;
		System.out.println(preNumber);
	}
}
