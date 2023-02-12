package javasessions;

public class AirthConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=9;
		int j=3;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		
		System.out.println(9/3);
//imp	System.out.println(9/0);//ArithmeticException
		System.out.println(0/9);//0
		
		System.out.println(9/2);//4
		//if 2 numbers are integers than resultant will be integers
		System.out.println(9.0/2);//4.5
		//if 1 of the number is floating number than resulatan will be float
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		System.out.println(-9/-2);//-11
		
//imp	System.out.println(9.0/0);//Infinity
		//java has specially designed for floating numbers or double which will
		//give infinity
	    //System.out.println(0/0);//ArithmeticException
	     System.out.println(9/0.0);//Infinity
		//if any of the number is floating number it will give infinty
		
	    System.out.println(9.0/0.0);//Infinity
		System.out.println(0.0/0);//NAN
		System.out.println(0.0/0.0);//NAN
		//NAN is applicable for zero only
		
		
		//concept is if one of the number is float it will give infinity
		//except is 0.0/0 which is a wrong expression. 
		
//imp	//Infinity,NAN
		
		//modulus operator
		System.out.println(9%3);//0
		System.out.println(9%2);//1
		System.out.println(100%7);//2
		
		
		System.out.println("Naveeen");//cursor will blink in the next line
		//Print Naveen and  generate a new line ,this is how we read above line 
		
		
		System.out.print("Naveeen1");//cursor will not blink in the next line
		System.out.println("--------");
		
		System.out.print("Automation");
		System.out.println("Testing");//AutomationTesting
		
		
		
		System.out.print("Naveen");
		System.out.print("Automation");
		System.out.print("Testing");
	}

}
