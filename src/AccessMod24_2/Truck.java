package AccessMod24_2;

import AccessModifier24.CarSameClass;

public class Truck {

	public static void main(String[] args) {
		CarSameClass c =new CarSameClass();
		//Outside of the package and non sub class  we can access only  public variables & Methods
		c.name="BMW";
		
		
	}

}
