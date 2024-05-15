package javasessions;

public class TestMethod10_11 {

	// data members
	// 1.class variables
	// 2.methods/.

	// types of methods/functions
	// cannot create a function inside a function
	// 1. No input No return(void means it cannot return anything )

	public void test() {
		System.out.println("Test -----");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

	// 2.no input and some return
	// return type:int
	// return & void cannot come together
	public int printValue() {
		int a = 10;
		int b = 20;
		int c = a + b;// c=30
		return c;
	}

	public String getTrainerName() {
		String trainerName = "Naveen";
		System.out.println(trainerName);
		return trainerName;
	}
	
	//3.some input & some return
	// return should return one value cannot return multiple values
	// return should be the last statement in a function
	public double getTotalBill() {
		System.out.println("Getting total bill");
		int foodBill = 200;
		double drinks = 22.33;
		int dessert = 46;
		double totalBill = foodBill + drinks + dessert;
		return totalBill;
	}

	// Some input and some return
	// return type is int
	// parameters: x,y--type int
	public int add(int x, int y) {
		int z = x + y;
		System.out.println("calling add method");
		return z;
	}

	public boolean isActive() {
		System.out.println("User is Active ");
		return true;
	}

	// return nothing & void can be together :this is allowed in Java
	// generally it is not used
	public void click() {
		System.out.println("Click on Element");
		return;
	}

	public void sendKeys(String value) {
		System.out.println("Entering value : " + value);
	}

	public int generateBill(int noOfProducts, int discount) {
		System.out.println("Generationg total bil");
		int finalBill = noOfProducts * 10;
		return finalBill;
	}

	public static void main(String[] args) {

		// How to call function.
		// By creating object of class.
		TestMethod10_11 t = new TestMethod10_11();
		t.test();
		int d = t.printValue();
		System.out.println(d);
		System.out.println(d - 5);
		System.out.println(t.printValue());

		String trainer = t.getTrainerName();
		System.out.println(trainer);

		double bills = t.getTotalBill();
		System.out.println(bills);
		System.out.println("Total bill after discount with paypal payment  " + (bills - 50));

		// below are arguments 10 20
		int sum = t.add(10, 20);// call by value//call a method by passing some values
		System.out.println(sum);

		int sum1 = t.add(40, 50);
		System.out.println(sum1);

		if (t.isActive()) {
			System.out.println("Credit the salary");
		}
	}

}
