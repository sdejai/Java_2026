package Lec10;

public class Specs {
	
	//instance variale
	String brandName;
	String frameColour;
	String type;
	Float price;
	int size;
	float power;
	
	public Specs() {
		
	}
	public Specs(String bN,String fC,String typ,float prc,int sz,float pow) {
		brandName=bN;
		frameColour=fC;
		type=typ;
		price=prc;
		size=sz;
		power=pow;
		
	}
	
//	Methods
	public void helpMeVisoion() {
		System.out.println("I can see you!!");
	}
	public void detailsPrint() {
		System.out.println(brandName);
		System.out.println(frameColour);
		System.out.println(price);
		System.out.println(type);
		System.out.println(size);
		System.out.println(power);
	}
	
}
