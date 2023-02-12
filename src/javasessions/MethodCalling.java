package javasessions;

public class MethodCalling {
	
	// How to call non static method without creating object
	//we can cal method directly without using object or object ref
	//it should be within the same class

	public void m1() {
		System.out.println("m1");
		m2();
		MethodCalling.t1();
	}
	public void m2() {
		System.out.println("m2");
		m3();
	}
	public void m3() {
		System.out.println("m3");
		//m1();//StackOverflowError//stuck in a infinte loop
		//m3();
	}
	
	
	// How to call  static method 
	//we can call method directly by using class name later it can be callled directly
	//it should be within the same class

	
	
	public static void t1() {
		System.out.println("t1");
		t2();
	}
	public static void t2() {
		System.out.println("t2");
		t3();
	}
	public static void t3() {
		System.out.println("t3");
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCalling ma =new MethodCalling();
		ma.m1();
		
		MethodCalling.t1();
	}

}
