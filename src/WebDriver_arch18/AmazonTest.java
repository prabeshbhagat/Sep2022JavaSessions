package WebDriver_arch18;

public class AmazonTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//SafariDriver driver=new SafariDriver();
		
		
		String browser="chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
		}else {
			System.out.println("P;lease pass the right browser");
		}
		
		
		
		driver.findElement();
		driver.findElements();
		driver.get("https://www.amazon.com");
		driver.sendkeys("email", "prabesh@gmail.com");
		driver.sendkeys("pwd", "prabs");
		driver.click("login buton");
		driver.getText("Welcome to Ideagen");
		driver.quit();
	}

}
