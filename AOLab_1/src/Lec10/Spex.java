package Lec10;

public class Spex {
	
	//instance variale
	String brandName;
	String framColor;
	String type;
	Float price;
	int size;
	float power;
	
	public Spex() {
		
	}
	public Spex(String bN,String fC,String typ,float prc,int size,float pow) {
		brandName=bN;
		framColor=fC;
		type=typ;
		price=prc;
		size=size;
		power=pow;
		
	}
	
//	Methods
	public void helpMeVisoion() {
		System.out.println("I can see you!!");
	}
	public void detailsPrint() {
		System.out.println(brandName);
		System.out.println(framColor);
		System.out.println(price);
		System.out.println(type);
		System.out.println(size);
		System.out.println(power);
	}
	
}
