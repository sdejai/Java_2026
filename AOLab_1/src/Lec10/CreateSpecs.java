package Lec10;

public class CreateSpecs {
	public static void main(String[] args) {
		Specs raybanObj1  = new Specs("RayBan","GoldBlack","SunGlass",12374,4,0);
		raybanObj1.detailsPrint();
		raybanObj1.brandName="titen";
		raybanObj1.detailsPrint();
		Specs rolexObj2  = new Specs();
		rolexObj2.brandName="Rolex";
		rolexObj2.detailsPrint();
	}
}
