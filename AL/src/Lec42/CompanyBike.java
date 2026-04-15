package Lec42;

public class CompanyBike {
	public static void main(String[] args) {
		Bike obj1 = new Bike();
//		obj1.modelNumber;
		obj1.setBrandName("RE");
		obj1.setModelNumber("350");
		System.out.println(obj1.getModelNumber());
		String result=obj1.getBrandName();
		System.out.println(result);
		obj1.setBrandName("BMW");
		obj1.setModelNumber("310R");
		System.out.println(obj1.getBrandName());
		System.out.println(obj1.getModelNumber());
	}
}
