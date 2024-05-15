package AaInterviewQuestinesOnly;

import java.util.Arrays;

public class ReverseWordsInagivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "i.like.this.program.very.much";
		String []str=s.split("[.]");
		String temp[] = new String[str.length];
		String rev=	str[str.length-1];
		
		
		for (int i = str.length - 1; i >= 0; i--) {
			int j = str.length - 1;
			temp[j - i] = str[i];
		}
		for (int k = 1; k < temp.length; k++) {
			rev=rev+"."+temp[k];
		}
	
		System.out.println(rev);
		
		
	}

}
