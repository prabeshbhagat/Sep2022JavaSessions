package BuilderPattern22;

public class EcommApplication {

	public EcommApplication login(String un, String pwd) {
		System.out.println("The UN:" + un + "passowrd is :" +pwd);
		//return new EcommApplication();
		return this;
	}

	public EcommApplication search(String prodName) {
		System.out.println("The Prod name is :" + prodName);
		return this;
	}

	public EcommApplication search(String prodName, String color) {
		System.out.println("The Prod name is " + prodName + "Color is :" + color);
		return this;
	}

	public EcommApplication addToCart(String qty) {
		System.out.println("The Number of products " + qty);
		return this;
	}

	public EcommApplication payment(String CC, int cvv) {
		System.out.println("The CC number is :" + CC + "Cvv is  :" + cvv);
		return this;
	}

	public EcommApplication logout() {
		System.out.println("logout");
		return this;
	}

}
