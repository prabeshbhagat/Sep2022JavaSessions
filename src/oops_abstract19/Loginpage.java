package oops_abstract19;

public class Loginpage extends Page {
	
	//hidden const will be called if no const is present
	
	@Override
	public void title() {
		System.out.println("Loginpage--title");
	}

	@Override
	public void URL() {
		System.out.println("Loginpage--URL");
	}
	
	//Method Hiding
	public static void pageStyle() {
		System.out.println("Loginpage--pageStyle--");
	}
	
	public void doLogin() {
		System.out.println("User is Logged in");
	}

}
