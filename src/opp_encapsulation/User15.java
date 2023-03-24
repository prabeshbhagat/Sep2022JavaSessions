package opp_encapsulation;

public class User15 {

	public static void main(String[] args) {
		Employee15 e1=new Employee15();
		//e1.age=20;cannot access private methods
		e1.setName("Brad");
		e1.setAge(20);
		e1.setSal(3000.33);;
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSal());
		
		
		//APIS
		//POST call-create a customer
		Customer15 c1=new Customer15("BMW", 45, "USA");
		System.out.println(c1.getName());//GET customer info
		System.out.println(c1.getUserId());
		System.out.println(c1.getLocation());
		
		System.out.println("----------------------------------");
		
		c1.setLocation("UK");//PUT/PATCH update customer lcaotion
		System.out.println(c1.getName());//GET customer info
		System.out.println(c1.getUserId());
		System.out.println(c1.getLocation());
		
		System.out.println("----------------------------------");
		
		c1.setName("Brad Hogg");;//PUT/PATCH update customer lcaotion
		System.out.println(c1.getName());//GET customer info
		System.out.println(c1.getUserId());
		System.out.println(c1.getLocation());
		
		
	}

}
