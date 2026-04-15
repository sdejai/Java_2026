package Lec39;

public class Bike {
	//Encapsulation
	
	private String brandName;
	private String model;
	private long price;
	private long power;
	
	public Bike(){
		
	}
	
	public Bike(String brandName,String model,long price,long power){
		this.brandName=brandName;
		this.model=model;
		this.price=price;
		this.power=power;
	}
	
	private void ride() {
		System.out.println("Ride!!");
	}
	
	public void setBrandName(String brandName) {
		this.brandName=brandName;
	}
	public String getBrandName() {
		return brandName;
	}
	
}
