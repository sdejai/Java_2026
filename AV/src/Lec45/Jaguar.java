package Lec45;

public class Jaguar extends Tata{
	//RunTime PolyMorphisum
	//Override PolyMorphisum
	public  void  carCollection() {
		System.out.println("Jagura Cars");
	}
	public static void main(String[] args) {
		Jaguar obj = new Jaguar();
		obj.carCollection();
	}
}
