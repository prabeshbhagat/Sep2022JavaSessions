package WebDriver_arch18;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("Launching Chrome Browser");

	}

	@Override
	public void findElement() {
		System.out.println("find Element");
	}

	@Override
	public void findElements() {
		System.out.println("find Elements");

	}

	@Override
	public void get(String url) {
		System.out.println("Launch URl" + url);

	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on element" + element);

	}

	@Override
	public void sendkeys(String element, String value) {
		System.out.println("enetering the value on " + element + " " + value);

	}

	@Override
	public String getText(String element) {
		System.out.println("getting the text on " + element);
		return null;
	}

	@Override
	public void quit() {
		System.out.println("quit the browser  ");

	}

}
