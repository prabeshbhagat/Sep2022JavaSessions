package AccessModifier24;

public class CarSameClass {
	
	
	public String name;
	private int price;
	protected String color;
	double mileage;
	
	public void m1() {
		System.out.println("Public m1");
	}
	
	private void m2() {
		System.out.println("private m2");
	}
	
	protected void m3() {
		System.out.println("protected m3");
	}
	
	 void m4() {
		System.out.println("default m4");
	}
	
	

	public static void main(String[] args) {
		
		CarSameClass c =new CarSameClass();
		//within the same class we can access everything variable and methods
		c.name="BMW";
		c.price=2000;
		c.color="Red";
		c.mileage=2;
		
		
		
	}

}
