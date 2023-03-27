package opp_encapsulation15;

public class UserLogin {

	public static void main(String[] args) {

		Loginpage15 lp1 = new Loginpage15("admin", "admin@123", "Contractor");

		System.out.println(lp1.getUsername());
		System.out.println(lp1.getPassword());
		System.out.println(lp1.role);

		System.out.println("-----------------------------");

		lp1.setPassword("admin@456");
		System.out.println(lp1.getPassword());

		System.out.println("-----------------------------");

		lp1.setUsername("admins");
		lp1.role = "Supervisor";
		System.out.println(lp1.getUsername());
		System.out.println(lp1.role);

		System.out.println(lp1.getUserInfo());

		System.out.println("-----------------------------");

		Loginpage15 lp2 = new Loginpage15("Tester", "test@123", "SDET");
		System.out.println(lp2.getUsername());
		System.out.println(lp2.getPassword());
		System.out.println(lp2.role);

		//Application15 a= new Application15();
	
		Application15.getUserInfo();

	}

}
