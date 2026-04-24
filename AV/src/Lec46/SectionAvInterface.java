package Lec46;

public interface SectionAvInterface {
	public static final String name = "RAM";;
	
	public abstract void sum();
	
	public  void sub();
	public  void div();
	public  void multiply();
	public static void name() {
		System.out.println("Section AV");
	}
	default void printInterface() {
		System.out.println("Interface");
	}
}
