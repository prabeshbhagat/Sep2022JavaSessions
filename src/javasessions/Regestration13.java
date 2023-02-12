package javasessions;

public class Regestration13 {

	String fName;
	String lName;
	String email;
	String mobile;
	String password;
	String cPassword;

	public Regestration13(String fName, String lName, String email, String mobile, String password, String cPassword) {

		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.cPassword = cPassword;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Regestration13 r1 = new Regestration13("Nihar", "Ranjan", "aasd@gmail.com", "456795890", "pwd", "pwd");
		System.out.println("fName :" + r1.fName + "lName :" + r1.lName + "email:" + r1.email + "Mobile :" + r1.mobile
				+ "password:" + r1.password+"Confirm pwd "+r1.cPassword);
	}

}
