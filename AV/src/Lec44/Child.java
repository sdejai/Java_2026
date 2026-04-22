package Lec44;

public class Child extends Panrent{
	public Child() {
		System.out.println("Child Construtor");
	}
	public static void main(String[] args) {
		Child obj = new Child();
		obj.car();
	}
}
