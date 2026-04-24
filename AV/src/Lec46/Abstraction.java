package Lec46;

public abstract class Abstraction {
	
	String name;
	public Abstraction() {
		
	}
	public Abstraction(String name) {
		this.name=name;
	}
	public void name() {
		System.out.println("Name");
	}
	public abstract void sum(int num1,int num2);
	
	public abstract void sub(int num1,int num2);
	
	public static void main(String[] args) {
//		Abstraction obj = new Abstraction("RAM");
		AbstraClassInherite ooj = new AbstraClassInherite("Hey");
		ooj.sum(12, 2);
		System.out.println(ooj.name);
	}
}
