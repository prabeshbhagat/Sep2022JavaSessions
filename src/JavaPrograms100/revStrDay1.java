package JavaPrograms100;

public class revStrDay1 {
	
	public static void main(String[] args) {
		String str="ReversE";
		String str1="";
		//System.out.println(str.length());
		for(int i =str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		
		System.out.println(str1);
		
	}
	
	
	

}
