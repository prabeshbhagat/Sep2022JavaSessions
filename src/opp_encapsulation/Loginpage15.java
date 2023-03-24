package opp_encapsulation;

public class Loginpage15 {

	private String username;
	private String password;
	public String role;

	public Loginpage15(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	//this is also encapsulation
	public String getUserInfo() {
		return username+" "+password+" "+role; 
	}
	
	

}
