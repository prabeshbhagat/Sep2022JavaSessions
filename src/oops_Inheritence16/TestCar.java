package oops_Inheritence16;

public class TestCar {

	public static void main(String[] args) {
		BMW b1= new BMW();
		
		b1.start();//--overiden method
		b1.stop();//--Inherited Method
		b1.refuel();//--Inherited Method
		b1.autoParking();//--Indvidual Method
		BMW.billing();
		b1.getBMWEngineInfo();
		
		System.out.println(b1.speed);
		System.out.println("--------car------------");
		Car c1= new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		Car.billing();
		c1.engine();
		
		System.out.println("--------------------");
		
		//Top/up casting
		//child class object can be referred by parent class ref variable
		Car c2=new BMW();
		c2.start();
		c2.stop();
		c2.refuel();
		c2.engine();
		//c2.auto//not allowed
		//ref type check will fail
		
		
		//child class object can be referred by grand parent class ref variable
		Vehicle v=new BMW();
		v.engine();
	
			
		
		//Down casting 
		////Parent class object can be referred by child class ref variable
		//BMW b2=new Car();//Type mismatch: cannot convert from Car to BMW
		BMW b2=(BMW) new Car();
		

		//java.lang.ClassCastException
		
		
		
		
		
	}

}
