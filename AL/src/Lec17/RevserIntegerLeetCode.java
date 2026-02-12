package Lec17;

public class RevserIntegerLeetCode {
	public static int revesr(int x) {
		long rev=0;
		while(x!=0) {
			int digit=x%10;
			x/=10;//x=x/10;
			rev=rev*10+digit;
		}

		if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) {
			return 0;
		}
		return (int)rev;
	}
	public static void main(String[] args) {
		int x=123;
		System.out.println(revesr(x));
	}
}
