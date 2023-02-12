package javasessions;

//famous Interview Question
//multiple reference
//Reference variable can be interchange
//one object can have multiple reference
public class User09 {

	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User09 u1 = new User09();
		u1.name = "Aman";
		u1.age = 25;
		u1.city = "BBSR";

		User09 u2 = new User09();
		u2.name = "Nidhi";
		u2.age = 28;
		u2.city = "Delhi";

		User09 u3 = new User09();
		u3.name = "Poonam";
		u3.age = 30;
		u3.city = "Bangalore";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u1 = u2;
		System.out.println("-----------u1=u2;----------");
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u2 = u3;
		System.out.println("-----------u2=u3;----------");
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		u3 = u1;
		System.out.println("-----------u3=u1;----------");
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

	}

}
