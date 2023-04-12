package SuperKeyword;

public class car extends Vechile {
	
	public car() {
		System.out.println("car Default Constructor");
	}
	
	public car(int i) {
		System.out.println("car single parametr Constructor..."+i);
	}
	
	public car(int i,int j) {
		System.out.println("car two parameter Constructor..."+i);
	}

	
	
	int max_speed=100;
	int price =500;
	
	public void racing() {
		System.out.println("Car class--Racing method");
	}
	
	
	public static void refuel() {
		System.out.println("CAR --refuel");
	}
	
	
	
	

}
