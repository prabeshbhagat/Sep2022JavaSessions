package opp_encapsulation;

public class Customer15 {
	
	//POJO class -->Plain Old Java Object.

	private String name;
	private int userId;
	private String location;
	
	
	public Customer15(String name, int userId, String location) {
		this.name = name;
		this.userId = userId;
		this.location = location;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}



	

}
