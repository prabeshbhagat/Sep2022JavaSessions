package PavanJava;

import java.util.ArrayList;

public class SplitStringsNumSplCharAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabets="";
		String nums="";
		String splChar="";
		
		
		String S = "geeks01for02geeks03!!!";
		ArrayList<String> list =new ArrayList<String>();
		for(char ch:S.toCharArray()) {
			if(Character.isUpperCase(ch) || Character.isLowerCase(ch) ) {
				alphabets+=ch;
			}else if(Character.isDigit(ch)) {
				nums+=ch;
			}else {
				splChar+=ch;
			}
		}
		list.add(alphabets);
		list.add(nums);
		list.add(splChar);
		System.out.println(list);
		
		
		
		

	}

}
