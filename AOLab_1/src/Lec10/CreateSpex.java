package Lec10;

public class CreateSpex {
	public static void main(String[] args) {
		Spex raybanObj1  = new Spex("RayBan","GoldBack","Sun glass",12374,4,0);
		raybanObj1.detailsPrint();
		raybanObj1.brandName="titen";
		raybanObj1.detailsPrint();
		Spex rolexObj2  = new Spex();
		rolexObj2.brandName="Rolex";
		rolexObj2.detailsPrint();
	}
}
