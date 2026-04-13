package Lec38;

public class StringBufferBacis {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("StringBuildler");
		System.out.println(sb1);
		StringBuffer sb =new StringBuffer("aman");
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append(" Kumar");
		System.out.println(sb);
		sb.insert(3, "Words");
		System.out.println(sb);
		sb.replace(0, 3,"key");
		System.out.println(sb);
		StringBuffer s=new StringBuffer();
		int cap=s.capacity();
		System.out.println(cap);
		
	}
}
