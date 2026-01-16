package Lec7;

import java.util.Scanner;

public class CharInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Here I am taking user input in integer
		int number =sc.nextInt();
		sc.nextLine();
		
/*	    
         user will give you charater 
		 input 
*/
		char charaterInput = sc.nextLine().charAt(0);
		System.out.println(number);
		System.out.println("User input charater "+charaterInput);
		
	}

}
