package Lec10;

public class AeroPlaneAbstraction extends Aeroplane {

	
	public AeroPlaneAbstraction() {
		
	}
	
	public AeroPlaneAbstraction(String airLineName,String modelNum) {
		super(airLineName,modelNum);
	}
	
	@Override
	public void callingCabinCrew() {
		System.out.println("Calling Cabin Crew!!!");
	}
	
	public static void main(String[] args) {
//		Aeroplane obj = new Aeroplane();
		AeroPlaneAbstraction obj = new AeroPlaneAbstraction("AIR INDIA","G25");
		obj.callingCabinCrew();
		System.out.println(obj.airLineName);
	}
}
