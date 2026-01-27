package Lec3;

public class BreakSwitch {
	public static void main(String[] args) {
		int num=2;
		for(int i=1;i<=10;i++) {
			if(i==8) {
				continue;
			}
			System.out.print(num*i+" ");
		}
		System.out.println();
		int table=5;
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.print(table*i+" ");
		}
	}
}
