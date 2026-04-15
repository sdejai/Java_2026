package Lec40;

import java.util.Scanner;

public class Ac {
	
	//properties || state
	//instance variable || field variable
	String brandName;
	float power;
	float coolingCapcity;
	long price;
		
	
	//Behavious
	//Methods
	
	public void cool() {
		System.out.println(brandName+" "+"cooling");
	}
	
	public void heat() {
		System.out.println(brandName+" "+"heating");
	}
	public void printDetails() {
		System.out.println(brandName+" "+coolingCapcity+" "+price+" "+power );
	}
	public static void main(String[] args) {
		Ac obj = new Ac();
		obj.brandName="LG";
		obj.coolingCapcity=2100;
		obj.price=70000;
		obj.power=2;
		obj.cool();
		obj.printDetails();
		Ac obj1 = new Ac();
		obj1.brandName="TATA";
		obj1.coolingCapcity=2100;
		obj1.price=70000;
		obj1.power=2;
		obj1.cool();
		obj1.printDetails();
	}
	
}
