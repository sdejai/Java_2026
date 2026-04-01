package Lec29;

public class StringCreate {
	public static void main(String[] args) {
		String name="aman";
		String name1=new String("naman");
		String name2="aman";
		String name3=new String("naman");
//		System.out.println(name);
//		System.out.println(name1);
//		System.out.println(name==name2);
//		System.out.println(name1==name3);
//		System.out.println(name1.equals(name3));//value check
		String name4 = new String("aman").intern();
//		System.out.println(name==name4);
		System.out.println(name1.equals(name3));
		
		
	}
}
