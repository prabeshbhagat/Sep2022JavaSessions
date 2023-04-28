package AccessModifier24;

public class CycleNonSubClass {

	public static void main(String[] args) {
		
		CarSameClass c =new CarSameClass();
		//within the same package we can access everything except private variable & methods
		c.name="BMW";
		c.color="Red";
		c.mileage=2;
		

	}

}
