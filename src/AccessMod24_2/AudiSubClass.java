package AccessMod24_2;

import AccessModifier24.CarSameClass;

public class AudiSubClass extends CarSameClass{

	public static void main(String[] args) {
		AudiSubClass a =new AudiSubClass();
		//Outside of the package and sub class  we can access only protected and public variables & methods
		a.name="BMW";
		a.color="Red";
		
		

	}

}
