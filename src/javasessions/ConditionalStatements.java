package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//=  assignment operator
		//== double equal to operator
		//double equal to operator is always going to provide boolean
		//double equal to operator is comparison operator
		System.out.println(10==10);//true
		System.out.println(10==20);//false
		
		
		int i=10;
		int j=20;
		if (i==j) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		//if should be followed by else a good practice 
		
		
		//--------------------
		
		if(true) {
			System.out.println("Hi");
		}else {//dead code example // as delebertly we have wrriten true so it will never got to else part
			System.out.println("Bye");
		}
		
		//solution of the above problem 
		
		boolean flag=true;
		if(flag) {
			System.out.println("Hi");
		}else {//dead code is gone as user can pass anything in flag
			System.out.println("Bye");
		}
		
	//example of nested if 	
		int marks =99;
		if(marks>=90) {
			 if(marks>=95) {
				 System.out.println("Grade A++");
				 if(marks==100) {
					 System.out.println("Eligible for scholarsip");
				 }else {
					 System.out.println("Not Eligible for scholarsip");
				 }
			 }else {
				 System.out.println("GRADE A");
			 }
				
		}else {
			System.out.println("Grade B");
		}
		
		
		//== is only used for Primitve data type
		//.equal to opertor is used for String comparision
		
		
		String s1="Selenium";
		String s2="Selenium";
		if(s1.equals(s2)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		//requirement
		//browser--  chrome ,edge ,firefox,IE
		
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		if(browser.equals("edge")) {
			System.out.println("Launch edge");
		}
		if(browser.equals("Firefox")) {
			System.out.println("Launch Firefox");
		}
		if(browser.equals("IE")) {
			System.out.println("Launch IE");
		}else {
			System.out.println("Please pass the right browser :"+" "+browser);
		}
		
		//two problems with the above code 
		//1.it will check all conditions all if case unnessary
		//2.even if any if case is executed it will go to the else part of the last if else
		
		//to overcome the above problem we will use if else if
		System.out.println("=======================");
		String br="Opera";
		if (br.equals("Opera")) {
			System.out.println("The browser name is :"+br);
		}else if (br.equals("Edge")) {
			System.out.println("The browser name is :"+br);
		}else if (br.equals("chrome")) {
			System.out.println("The browser name is :"+br);
		}else {
			System.out.println("Please pass the right browser :");
		}
		
		System.out.println("--------------------------------");
		
		//if br we will pass Opera it will execute the 1st line
		//if br we will pass chrome it will check all above and than come to chrome
		//if br we will pass Safari it will check all above and than come to else
		
		
		if(true) {
			System.out.println("Hello World");
			//break;//break cannot be used outside of a loop or a switch
		}
		
		
	}
	
	
	
	
	

}
