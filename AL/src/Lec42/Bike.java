package Lec42;

public class Bike {
	
	private String brandName;
	private int price;
	private String modelNumber;
	private String colour;
	
	public void run(){
		System.out.println("run");
	}
	
	public void setBrandName(String brandName) {
		this.brandName=brandName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber=modelNumber;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	
}
