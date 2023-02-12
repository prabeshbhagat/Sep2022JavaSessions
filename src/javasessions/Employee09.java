package javasessions;

public class Employee09 {

	// class variables
	String name;
	int age;
	boolean isPerm;
	float sal;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1--create the object by using new keyword
		Employee09 e=new Employee09();
		e.name="Sundar";
		e.age=30;
		e.isPerm=true;
		e.sal=24.55f;
		
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.isPerm);
		System.out.println(e.sal);
		
		
		
		
		//2--it is not initalized so it will give there respective default values
		Employee09 e1=new Employee09();
		System.out.println(e1.name);//null
		System.out.println(e1.age);//0
		System.out.println(e1.isPerm);//false
		System.out.println(e1.sal);//0.0
		
		//3--Creating a object with no ref
		new Employee09();
		//how to intilize the no ref object
		new Employee09().name="Tom";
		//below will create one more object with intilizing diff variable i.e sal 
		//apart from name variable
		new Employee09().sal=55.25f;
		
		//4--Creating a object pointing to null
		//null ref object
		Employee09 e3=new Employee09();
		e3=null;
		//e3.name="Shardul";
		//System.out.println(	e3.name);//NullPointerException
		//as object is pointing to 

		
		//5--Creating a reference variable without creating object
		Employee09 e4;
		//e4.name="TOm";//The local variable e4 may not have been initialized
		
		//6--Creating a reference variable pointing to null without creating 
		//object
		Employee09 e5=null;
		//e5.name="TOm";////NullPointerException
		
		//dierctly print the ref variable we will get some garbage value
		Employee09 e6=new Employee09();
		System.out.println(e6);//javasessions.Employee09@4361bd48
	}

}
