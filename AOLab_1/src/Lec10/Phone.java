package Lec10;

public class Phone {
	String brandName;
	String modelName;
	int ramSize;
	String processor;
	// Default Constructor
	public Phone() {
		
	}
	// Parameterized Constructor
	public Phone(String brandName,String modelname,int ramSize,String processor) {
		this.brandName=brandName;
		this.modelName=modelname;
		this.ramSize=ramSize;
		this.processor=processor;
	}
	
	public void caling() {
		System.out.println("I can call any one");
	}
	public void printDetails() {
		System.out.println(brandName+ " "+modelName+" "+ramSize+" "+processor);
		
	}
}
