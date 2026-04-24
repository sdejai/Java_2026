package Lec46;

public  class AbstraClassInherite extends Abstraction{

	public AbstraClassInherite() {
		
	}
	public AbstraClassInherite(String name) {
		super(name);
	}
	
	@Override
	public void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}

	@Override
	public void sub(int num1, int num2) {
		System.out.println(num1-num2);
		
	}

}
