package javasessions;

public class Car09 {

	String name="Hyundai";//should not define class variable its not a good practice every car has it name its not common
	String Color;
	double price;
	String type;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car09 c1 = new Car09();
		c1.name="BMW";
		c1.Color="Red";
		c1.price=55.66;
		c1.type="Sedan";
		
		Car09 c2 = new Car09();
		c2.name="Mini Cooper";
		c2.type="Mini car";

		System.out.println(c1.name+" "+c1.Color+" "+c1.price+" "+c1.type);
		System.out.println(c2.name+" "+c2.Color+" "+c2.price+" "+c2.type);
		c2.price=25.66;
		c2.Color="Black";
		System.out.println(c2.name+" "+c2.Color+" "+c2.price+" "+c2.type);
		
		Car09 c3 = new Car09();
		c3.name="Honda";
		System.out.println(c3.name+" "+c3.Color+" "+c3.price+" "+c3.type);
		
		
	}

}
