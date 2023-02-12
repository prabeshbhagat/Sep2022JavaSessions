package javasessions;

public class Customer13 {

	// Constructor COncept:
	// Deafult cosntructor
	//Constructor overloading
	public Customer13() {
		System.out.println("0 Param Constructor");
	}

	// Duplicate constructor is not allowed
//	public Customer13() {
//		System.out.println("0 Param Constructor");
//	}
	
	public Customer13(int i) {
		System.out.println("1 Param Constructor"+ i);
	}
	
	public Customer13(int i,int j) {
		System.out.println("2 Param Constructor"+ i + j);
	}
	
	public Customer13(int i,String p) {
		System.out.println("2 Param Constructor"+ i + p);
	}
	
	public Customer13(String k,int l) {
		System.out.println("2 Param Constructor"+ k + l);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer13 c1 = new Customer13();
		Customer13 c2 = new Customer13(10);
		Customer13 c3 = new Customer13(10,20);
		Customer13 c4 = new Customer13(10," Stuner");
		Customer13 c5 = new Customer13("Ross",20);

	}

}
