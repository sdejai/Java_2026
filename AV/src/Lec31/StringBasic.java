package Lec31;

public class StringBasic {
	public static void main(String[] args) {
		String city="Mathura";
		String city1="Mathura";
		String city3=new String("Agra");
		String city4=new String("Agra");
		System.out.println(city);
		System.out.println(city==city1);
		System.out.println(city3==city4);
	}
}
