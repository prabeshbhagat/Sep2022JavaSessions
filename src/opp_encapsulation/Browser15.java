package opp_encapsulation;

public class Browser15 {

	public void launchBrowser() {
		System.out.println("--Launching chrome browser");
		checkBrowserVersion();
		checkBrowserOsCompatiblity();
	}

	private void checkBrowserVersion() {
		System.out.println("--Checking browser Version");
	}

	private void checkBrowserOsCompatiblity() {
		System.out.println("--Checking browser Compatiblity");
	}

}
