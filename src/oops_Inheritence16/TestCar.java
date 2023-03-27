package oops_Inheritence16;

public class TestCar {

	public static void main(String[] args) {
		BMW b1= new BMW();
		
		b1.start();//--overiden method
		b1.stop();//--Inherited Method
		b1.refuel();//--Inherited Method
		b1.autoParking();//--Indvidual Method
		BMW.billing();
		b1.engine();
		
		Car c1= new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		Car.billing();
		c1.engine();
		
		System.out.println("--------------------");
		
		//Top casting
		//child class object can be referred by parent class ref variable
		Car c2=new BMW();
		c2.start();
		c2.stop();
		c2.refuel();
		c2.engine();
		//c2.auto//not allowed
		
		//Down cating 
		////Parent class object can be referred by child class ref variable
		//BMW b2=new Car();//Type mismatch: cannot convert from Car to BMW
		BMW b2=(BMW) new Car();
		

		//java.lang.ClassCastException
		
		
		
		
		
	}

}
