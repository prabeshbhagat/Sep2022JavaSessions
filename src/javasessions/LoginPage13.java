package javasessions;

public class LoginPage13 {

	String username;
	String password;

	public LoginPage13(String username,String password) {
		System.out.println();
		this.username=username;
		this.password=password;
	}

	public void doLogin() {
		System.out.println("Enter Username  " + username);
		System.out.println("Enter password  " + password);

		System.out.println("Click on button");
		System.out.println("User is logged in ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LoginPage13 l1 = new LoginPage13();//if the default constructor is not present java will create a default const 
//		l1.doLogin("loginame", "asdfgh");

		LoginPage13 l1 = new LoginPage13("tom@gmail.com", "abch786");
		l1.doLogin();
		
		
		LoginPage13 l2 = new LoginPage13("shami@gmail.com", "nan786");
		l1.doLogin();

	}

}
