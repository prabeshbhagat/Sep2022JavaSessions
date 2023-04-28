package JavaQuestiones;

public class LeapYear {
	
	//number divisible by 4
	//it should be a century year ending with 00
	//century year  is a leap year only when it is divisble  by 400
	
	//1900 is not a leap year
	//2012 is a leap year

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2016;
		boolean flag=false;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					flag=true;
				}else {
					flag=false;
				}
			}else {
				flag=true;
			}
		}else {
			flag=false;
		}
		
		if(flag) {
			System.out.println("The year is leap year :"+year);
		}else {
			System.out.println("The year is not a  leap year :"+year);
		}

	}

}
