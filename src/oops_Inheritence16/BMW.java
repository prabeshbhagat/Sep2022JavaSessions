package oops_Inheritence16;

//BMW extends Car
//BMW IS-A  Car
//IS-A relationship
public class BMW extends Car {
	
	int speed=300;
	
	//Method Overriding
	//when we have method in parent class and the same method in child class
	//method name should be same 
	//parameter number should be same 
	//parameter sequence should be same 
	//return type should be same
	//static method cannot be overriden
	
	//private start method in car The method start() of type BMW must override or implement a supertype method
	//Cannot reduce the visibility of the inherited method from Car private in child
	public BMW() {
		System.out.println("--BMW const----");
	}
	
	
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
	
	//HAS- A relationship--composition in java
	
	public void getBMWEngineInfo() {
		Engine eg= new Engine();
		eg.engine();
	}
}
