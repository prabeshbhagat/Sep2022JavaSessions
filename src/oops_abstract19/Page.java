package oops_abstract19;

//Abstract Class

//1.only abstract method-100% abstarction
//2.only non abstract method -0% abstraction.
//3.abs+non abstract methods -x% partial abstraction.

public abstract class Page {
	public Page() {
		System.out.println("Page--const");
	}

	// can not create Object of abstract class

	public abstract void title();

	public abstract void URL();

	public void pageLoadTimeout() {
		System.out.println("--pageLoadTimeout--");
	}

	public final void displayLogo() {
		System.out.println("--displayLogo--");
	}

	public static void pageStyle() {
		System.out.println("page--pageStyle--");
		getPageTheme();
	}

	private static void getPageTheme() {
		System.out.println("--getPageTheme--");
	}

}
