package Lec22_ExamRevion;

public class PinGen {
	public static void main(String[] args) {
		int inpt1=123;
		int inpt2=582;
		int inpt3=175;
		
		int inputUnit1=inpt1%10;
		int inputTen1=(inpt1/10)%10;
		int inputHund1=inpt1/100;
		int max1=(inputUnit1>=inputTen1 && inputUnit1 >=inputHund1)?
				inputUnit1:((inputTen1>=inputUnit1 && inputTen1>=inputHund1)?
						inputTen1:inputHund1);
		int inputUnit2=inpt2%10;
		int inputTen2=(inpt2/10)%10;
		int inputHund2=inpt2/100;
		int max=(inputUnit2>=inputTen2 && inputUnit2 >=inputHund2)?
				inputUnit2:((inputTen2>=inputUnit2 && inputTen2>=inputHund2)?
						inputTen2:inputHund2);
		int inputUnit3=inpt3%10;
		int inputTen3=(inpt3/10)%10;
		int inputHund3=inpt3/100;
//		int max3=
//		System.out.println(inputUnit3);
//		System.out.println(inputTen3);
//		System.out.println(inputHund3);
		
	}
}
