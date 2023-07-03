package javasessions;

public class Students14 {

	// method overlaoding poly9many) morphism(forms):compile time ;decisoin is taken
	// during compliation
	// Within the same class we have multiple methods
	// 1.With the same method name
	// 2.With diff params
	// 3.With diff seq of parameter
	// 4.return type doesnt matter

	// code readablity
	// same method with diff variety

	/**
	 * Duplicate method test() in type Students14 public void test() {
	 * System.out.println("0 Param"); }
	 * 
	 * public void test() { System.out.println("0 Param"); }
	 **/

	public void test() {
		System.out.println("0 Param");
	}

	public void test(int a) {
		System.out.println("1 Param");
	}

	// Duplicate method return does not matters
//	public int test(int a) {
//		System.out.println("1 Param");
//		return 100;
//	}

	public void test(String a) {
		System.out.println("1 diff Param");
	}

	public void test(String a, int b) {
		System.out.println("2 diff Params");
	}

	public void test(int a, String b) {
		System.out.println("2 diff Params");
	}

	// realtime examples of method overloading
	// ecomm: amazon:
	public void login() {
		System.out.println("login with no creds");
	}

	public void login(String username, String password) {
		System.out.println("login with right creds");
	}

	public void login(String username, String password, String role) {
		System.out.println("login with right creds");
	}

	public void login(String username, String password, int otp) {
		System.out.println("login with right creds");
	}

	// asset class in EHS
	//Project examples

	public void getAsset(String asset) {

	}

	public void getAsset(String asset, String assetType, String LocationName) {

	}

	public void getAsset(String asset, String LocationName) {

	}

	// search:
	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {

	}

	// payment:
	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	public void doPayment(String bankName, String password, String userId) {

	}

	// uber:
	public void booking() {

	}

	public void booking(String carType) {

	}

	public void booking(String carType, String stPoint, String endPoint) {

	}

	public void booking(String carType, String stPoint, String endPoint, int pssngers) {

	}

	//
	public void launchUrl(String url) {

	}

	public String launchUrl(String url, String queryParam) {
		String mainUrl = url + queryParam;
		return mainUrl;
	}

	public String launchUrl(String url, String queryParam, String browserName) {
		String mainUrl = url + queryParam;
		System.out.println("launch " + browserName);
		return mainUrl;
	}

	// can we overload static methods: YES
	public static void getInfo(String name) {

	}

	public static void getInfo(String name, String deptName) {

	}

	public static void main(String[] args) {
		Students14 st = new Students14();
		st.test(10);
		st.test("tom", 25);

		Students14.getInfo("naveen");
	}

}
