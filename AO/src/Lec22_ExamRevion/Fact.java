package Lec22_ExamRevion;

public class Fact {
	public static void main(String[] args) {
		int n=3;
		int factCal=1;
//		5*4*3*2*1
		for(int i=n;i>=1;i--) {
			factCal=factCal*i;
		}
		System.out.println(factCal);
	}
}
