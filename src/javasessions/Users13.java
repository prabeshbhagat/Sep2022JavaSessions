package javasessions;

public class Users13 {
	
	//purpose of constructor
	//1.Intialize class variables
	//2.restriction on object creation
	//object will be created as per the constructor defined.
	
	
	//constructor will not be stored inside the ,stack ,heap or CMA
	
	//Diff between functions & Constructor
	//1.the business logic is written inside the functions but the constructor is used to initalize the class variable
	//2.the function is called with the obj ref (non static) & by class name (staic) but the cosntructor is called whenever an object is created
	//3.the functions may or may not return values but constructor will never return anything.

	String name;
	int id;
	String city;
	boolean IsActive;

//	public Users13() {
//		System.out.println("0 Param Constructor");
//	}

	// approach 1 to ititalize class variable
//	public Users13(int id, String name) {
//		System.out.println("2 Param Constructor");
//		id = id;// The assignment to variable id has no effect
//		name = name;// The assignment to variable id has no effect//as jave thinks local varibale is
//					// getting intialized
//		// ..not the class varibales.
//
//	}

//	//approach 2 to ititalize class variables
//	public Users13(int id1 ,String name1) {
//		System.out.println("2 Param Constructor");
//		id=id1;
//		name=name1;
//		//this will solve the confusion & intialize the class variables 
//		//..but everytime we cannot write id1,name1
//		//..its not a good coding pratice
//		
//}

	// approach 3 to ititalize class variables by using this keyword
	// this will refer to the class variables
	// this wil intialize class variables
	public Users13(int id, String name) {
		System.out.println("2 Param Constructor");
		this.id = id;// The assignment to variable id has no effect
		this.name = name;// The assignment to variable id has no effect//as jave thinks local varibale is
		// getting intialized
		// ..not the class varibales.

	}

	public Users13(int id, String name, String city) {
		System.out.println("3 params constructor");
		this.id = id;
		this.name = name;
		this.city = city;

	}

////approach 4th to ititalize class variables by using this keyword

	public Users13(String name, int id, String city, boolean isActive) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		IsActive = isActive;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Users13 u1=new Users13();//The constructor Users13() is undefined
		// 1 way of creating an object
		Users13 u2 = new Users13(20, "Tom");
		System.out.println(u2.name);// accessing the class variables where just the local variables is initalized
		System.out.println(u2.id);// hence these 2 lines will give null and ,0
		// using this keyword the class variables got intialized and we are able to
		// access it .

		// Users13 u3 = new Users13();//The constructor Users13() is undefined
		// as there is no constructor with 0 params
		// whatever constructor is defined above we can create the object of the same
		// type

		// 2nd way of creating an object

		Users13 u4 = new Users13(501, "Shayam", "Koraput");
		System.out.println(" Id:" + u4.id + " Name:" + u4.name + " City:" + u4.city);
		
		Users13 u5 = new Users13("Stoi", 601, "Mayurbhanj", true);
		System.out.println(" Id:" + u5.id + " Name:" + u5.name + " City:" + u5.city+" Status "+u5.IsActive);

		
		
	}

}
