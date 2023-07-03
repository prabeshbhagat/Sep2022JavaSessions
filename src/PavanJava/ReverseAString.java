package PavanJava;

public class ReverseAString {

	public static void main(String[] args) {
		
		
		String str2="Ideagen";
		String rev2="";
		for(int i=str2.length()-1;i>=0;i--) {
			rev2=rev2+str2.charAt(i);
		}
		
		System.out.println(rev2);
		
		
		
		
			
		
		
		
		
		
		// TODO Auto-generated method stub

		
		//using charAt and String concatenation
		String str = "geeks";
		int len = str.length();
		System.out.println(len);
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);
		
		
		//Using to char array
		String str1 = "prabesh kumar";
		String rev1="";
		char ch[]=str1.toCharArray();
		for(int j=ch.length-1;j>=0;j--) {
			rev1=rev1+ch[j];
		}
		System.out.println(rev1);
		
		
		//using String buffer
		StringBuffer bf=new StringBuffer(rev);
		System.out.println(bf.reverse());
		

	}

}
