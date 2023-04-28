package AccessModifier24;

public class BMWSubClass extends CarSameClass{

	public static void main(String[] args) {
		BMWSubClass b =new BMWSubClass();
		//within the same package we can access everything except private variables & methods
		b.name="BMW";
		b.color="Red";
		b.mileage=2;
		
		

	}

}
