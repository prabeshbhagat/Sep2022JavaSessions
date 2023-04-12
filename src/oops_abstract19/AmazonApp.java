package oops_abstract19;

public class AmazonApp {
	
	//parent const than we have child const.
	//when we create object parent class constructor will be called 1st than child const will be called.

	public static void main(String[] args) {
		Loginpage lp =new Loginpage();
		lp.URL();
		lp.title();
		lp.pageStyle();
		lp.doLogin();
		
		lp.pageLoadTimeout();
		lp.displayLogo();
		Page.pageStyle();
		
		System.out.println("-------------------");
		//Top casting
		//child class object referred by parent abstract class ref variable
		Page p =new Loginpage();
		p.title();
		p.URL();
		p.pageLoadTimeout();
		p.displayLogo();
	
		
	}

}
