package oops_Inheritence16;

public  class Car extends Vehicle {
	
	int speed=100;
	
	//final:
	//1. with methods-- prevents method overriding:
	//error--Cannot override the final method from Car
	//2.with class Prevent Inheritence
	//error--The type BMW cannot subclass the final class Car
	//3. with variables to provide the constant values to a variable.
	
	public Car() {
		System.out.println("--Car const----");
	}

	public void start() {
		System.out.println("--Car Start--");
	}

	public void stop() {
		System.out.println("--Car Stop--");
	}

	public void refuel() {
		System.out.println("--Car Refuel--");

	}
	
	public static void billing() {
		System.out.println("--Car Billing--");
	}
}
