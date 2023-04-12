package BuilderPattern22;

public class AmazonTest {

	public static void main(String[] args) {
		EcommApplication ecom = new EcommApplication();
		
		
		ecom.login("abc@gmail.com", "pwd123")
				.search("ipad")
					.addToCart("ipad")
						.payment("1234 5555 6666 9999", 774);
		
		System.out.println("Workflow 2-------------------");
		
		ecom.login("abc@gmail.com", "pwd123")
		.search("ipad")
			.addToCart("ipad")
				.logout();
	}

}
