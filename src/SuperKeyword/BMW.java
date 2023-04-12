package SuperKeyword;

public class BMW extends car {
	
	int max_speed=200;
	
	
	//Super keyword
	
	//1.can call parent class variable having the same var in child class
	//2.can call child class method having the same method in child class
	//3.can call parent class const from child class but its should  be the 1st statement
	//4.can call static variables or methods in parent class by super keywoed
	//private method cannot be called by super
	
	
	public BMW() {
		super(10);
		System.out.println("BMW Default Constructor");
	}

	public void info() {
		System.out.println(super.max_speed);//if immediate parent has no value than grand parent
		System.out.println(max_speed);
		super.racing();
		racing();
		
		System.out.println(super.price);
		System.out.println(price);
		
		super.refuel();
		refuel();
		
	}
	
	public void racing() {
		System.out.println("BMW class--Racing method");
	}
	
	public static void refuel() {
		System.out.println("BMW --refuel");
	}

	public static void main(String[] args) {
		BMW b=new BMW();
		b.info();
	}

}
