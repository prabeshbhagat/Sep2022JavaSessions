package oops_Inheritence16;

public class BMW extends Car {
	
	//Method Overriding
	//when we have method in parent class and the same method in child class
	//method name should be same 
	//parameter number should be same 
	//parameter sequence should be same 
	//return type should be same
	//static method cannot be overriden
	
	@Override
	public void start() {
		System.out.println("--BMW Start--");
	}

	public void autoParking() {
		System.out.println("--BMW AP--");
	}
	
	//@Override--nOt possible
	//Method Hiding Concept
	public static void billing() {
		System.out.println("--BMW Billing--");
	}
}
