package Lec10;

public abstract class Aeroplane {
	
	String airLineName;
	String modelNum;
	
	public Aeroplane() {
		
	}
	public Aeroplane(String airLineName,String modelNum) {
		this.airLineName=airLineName;
		this.modelNum=modelNum;
	}
	
	public abstract void callingCabinCrew();


	public void seatBeltAlert() {
		System.out.println("Seat belt Alert");
	}
	
}
