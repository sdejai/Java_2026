package Lec39;

public class BikeCreate {
	public static void main(String[] args) {
//		Bike obj = new Bike();
////		obj.brandName="BMW";
//		obj.setBrandName("BMW");
//		
////		System.out.println(obj.getBrandName());
//		obj.setBrandName("Bjaj");
//		System.out.println(obj.getBrandName());
		Bike obj1 = new Bike("Honda","400",400000,350);
		System.out.println(obj1.getBrandName());
	}
}
