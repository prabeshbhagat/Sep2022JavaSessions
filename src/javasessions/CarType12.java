package javasessions;

public class CarType12 {

	//static variable can be changed to avoid it we will use final
	String ctype;
	int price;
	String color;
	static int wheels = 4;// common property value can be made as Static
	static final int mirror=3;

	public static void main(String[] args) {
		CarType12 c1 = new CarType12();
		c1.ctype = "BMW";
		c1.color = "Red";
		c1.price = 50;
		// c1.wheels=4;

		CarType12 c2 = new CarType12();
		c1.ctype = "Audi";
		c1.color = "Balck";
		c1.price = 60;
		// c1.wheels=4;

		CarType12 c3 = new CarType12();
		c1.ctype = "Honda";
		c1.color = "White";
		c1.price = 20;
		// c1.wheels=4;
		
		//How to access static varaiables
		
		//Type 1:By using object ref
		//warning:The static field CarType12.wheels should be accessed in a static way
		//not advisable
		System.out.println(c1.wheels);
		
		//Type 2:By using classname -advisable
		System.out.println(CarType12.wheels);
		
		//Tyep 3 :directly by using variable name as its accesing a static property
		//..from another static method 
		System.out.println(wheels);
		
		//Cannot make a static reference to the non-static field color
		//System.out.println(color);
		//Cannot make a static reference to the non-static field CarType12.color
		//System.out.println(CarType12.color);
		
		//Static variable can also be changed
		//which is a big problem
		CarType12.wheels=10;
		System.out.println(CarType12.wheels);
		
		System.out.println(CarType12.mirror);
		//CarType12.mirror=10;The final field CarType12.mirror cannot be assigned
		
		
		final int horn=1;
		//horn=-1;
		//The final local variable horn cannot be assigned.
		//It must be blank and not using a compound assignment
		
		

	}

}
