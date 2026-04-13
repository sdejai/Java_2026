package Lec10;

public class CreatePhone {
	public static void main(String[] args) {
		Phone obj1=new Phone("Nokia","c2",1,"h1");
		obj1.caling();
		obj1.printDetails();
		Phone obj2=new Phone("iphone","17",8,"A17");
		obj2.printDetails();
	}
}
