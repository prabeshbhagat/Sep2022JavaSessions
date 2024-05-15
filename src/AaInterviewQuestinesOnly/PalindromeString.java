package AaInterviewQuestinesOnly;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "hq";
		/*
		  String rev="";
		  for(int i = S.length() - 1; i >= 0; i--) {
			rev=rev+S.charAt(i);
		}

		
		if(S.equals(rev)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	
		 */
		
		
		String S1 = "abba";
		StringBuilder sb= new StringBuilder(S1);
		StringBuilder rev=sb.reverse();
		
		if(S1.equals(rev.toString())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
