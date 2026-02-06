package Lec4;

public class Continue {
	public static void main(String[] args) {
		for(int i=0;i<=20;i++) {
			if(i==10) {
				continue;
			}
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
