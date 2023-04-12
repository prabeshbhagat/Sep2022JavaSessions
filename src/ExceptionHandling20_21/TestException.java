package ExceptionHandling20_21;

public class TestException {

	public static void main(String[] args) {
		
		
		String browser="opera";
		if(browser.equals("chrome")) {
			System.out.println("Chrome Broswer");
			
		}else if(browser.equals("firfox")) {
			System.out.println("firfox Broswer");
			
		}else if(browser.equals("safari")) {
			System.out.println("safari Broswer");
			
		}else {
			System.out.println("Browser not found..");
			throw new MyException("Browser not found");
		}
		
		System.out.println("ff");


	}

}
