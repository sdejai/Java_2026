package Lec1;

public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("Main Body");
		System.out.println();
	}
	static {
		System.out.println("Static Body");
	}
	
}
