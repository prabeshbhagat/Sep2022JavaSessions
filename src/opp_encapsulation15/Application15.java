package opp_encapsulation15;

public class Application15 {

	private Application15() {
		System.out.println("Restricted for Deafult Object creation");
	}

	public Application15(int a) {
		System.out.println("Not Restricted for Object creation");
	}

	public static void getUserInfo() {
		System.out.println("Accesing static method by class name.");
	}

	// System class is the best example of the private constructor with public
	// method
	// object creation is restricted via private constructor

}
