/**
 * 
 */
package javasessions;

public class StringConcept {

	
	public static void main(String[] args) {
		
		//String is a default class in Java 
		//S starts with capital
		
		String s="Hello World";
		System.out.println(s);
		
		String s1="This is my first java code";
		System.out.println(s1);
	
		//String s2=100;
		String s2="100";
		System.out.println(s2+20);
		
		
		String x1="Hello";
		String x2="Selenium";
		
		int a=100;
		int b=200;
		
		double d1=12.33;
		double d2=22.33;
		
		//String + means concatenation or append 
		
		System.out.println(a+b);//300
		System.out.println(x1+x2);//HelloSelenium
		System.out.println(a+b+x1+x2);//300HelloSelenium
		System.out.println(x1+x2+a+b);//HelloSelenium100200
		System.out.println(x1+x2+(a+b));//HelloSelenium300
		//execution will start from Left to right
		
		System.out.println(a+b+x1+x2+a+b);
		
		System.out.println(a+b+x1+x2+a+b+d1+d2);
		
		char c1='p';
		System.out.println(x1+c1);
		System.out.println("Hello Selenium");
		System.out.println("The value of a is :"+a);
		System.out.println("The value of a is :"+b);
		System.out.println("The Sum is :"+a+b);
		System.out.println("The Sum is :"+(a+b));
		
		System.out.println(x1+x2);//HelloSelenium
//		System.out.println(x1  +   x2);/HelloSelenium
		System.out.println(x1+" "+x2);//Hello Selenium
		
//		//Space is a string type. 
		
		
		//int n=null;
		//Null is not applicable for Primitive data type
		//its only applicable for classes & objects
		
		String n=null;
		//Null is applicable for String classs etc..
		//null means no value
		
		
		
		
		
	}

}
