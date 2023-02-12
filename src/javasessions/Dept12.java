package javasessions;

public class Dept12 {

	public static void sendMail() {

	}

	public  void sendInfo() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to access static method
		Dept12.sendMail();
		sendMail();
		
		Dept12 d1=new Dept12();
		d1.sendMail();//warning 
//		/The static method sendMail() from the type Dept12
		//should be accessed in a static way
		
		
		//How to access Non static method 
		// by susing object ref
		d1.sendInfo();
		
		//Dept12.sendInfo();//NA
		//Cannot make a static reference to the
		//non-static method sendInfo() from the type Dept12
		

	}

}
