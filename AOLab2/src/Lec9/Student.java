package Lec9;

public class Student {
	
	String name;
	long rollNumber;
	String fatherName;
	String address;
	
	//No-Arg Constructor
	public Student(){
		
	}
	//Parameterized Constructor
	public Student(String name,long rollNumber, String fatherName,String address){
		this.name=name;
		this.rollNumber=rollNumber;
		this.fatherName=fatherName;
		this.address=address;
	}
	
	public void sing() {
		System.out.println(name+" can sing");
	}
	
	public void printDetails() {
		System.out.println("Student name is " +name+" "+ ", roll Number "+ rollNumber+" "+"father name is"+ fatherName+" "+address);
	}
	
	public static void main(String[] args) {
////		Student obj = new Student("Shubham",1223,"RAM","Mathura");
////		obj.name="Shubham";
////		obj.fatherName="Ram";
////		obj.rollNumber=1234598;
////		obj.address="Mathura";
//		obj.sing();
//		obj.printDetails();
////		Student obj1 = new Student("Sauabha",122,"AMAR","Mathura");
//		obj1.printDetails();
		Student st = new Student();
	}
}
