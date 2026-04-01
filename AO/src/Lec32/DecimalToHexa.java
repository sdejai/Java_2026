package Lec32;

public class DecimalToHexa {
	public static void main(String[] args) {
		int num=27;
		String result="";
		while(num>0) {
			int rem=num%16;
			switch(rem) {
			case 10:
				result=result+"A";
				break;
			case 11:
				result=result+"B";
				break;
			case 12:
				result=result+"C";
				break;
			case 13:
				result=result+"D";
				break;
			case 14:
				result=result+"E";
				break;
			case 15:
				result=result+"F";
				break;
			default:
				result=result+rem;
			}
			num/=16;
		}
		for(int i=result.length()-1;i>=0;i--) {
			System.out.print(result.charAt(i));
		}
	}
}
