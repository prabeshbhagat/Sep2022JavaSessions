package javasessions;

public class Browser11 {

	// WAF
	// AC
	// create a method launchBrowser with params chrome,firefox,IE
	// return boolean

	public boolean launchBrowser(String browserName) {
		boolean flag = false;
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println(browserName);
			flag = true;
			break;

		case "firefox":
			System.out.println(browserName);
			flag = true;
			break;

		case "ie":
			System.out.println(browserName);
			flag = true;
			break;

		default:
			System.out.println("Please pass the right browser name...");
			break;
		}

		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser11 b1=new Browser11();
		boolean f1=b1.launchBrowser("cHrome");
		System.out.println(f1);
		

	}

}
