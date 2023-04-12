package WebDriver_arch18;

public interface WebDriver extends SearchContext {
	
	//100% abstraction
	//dont include static & default method as stsatic method does not comes under object.
	

	@Override
	public void findElement();

	@Override
	public void findElements();

	public void get(String url);

	public void click(String element);

	public void sendkeys(String element, String value);

	public String getText(String element);

	public void quit();

}
