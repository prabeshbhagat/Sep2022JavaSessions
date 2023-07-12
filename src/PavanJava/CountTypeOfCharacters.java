package PavanJava;

import java.util.Arrays;

public class CountTypeOfCharacters {

	public static void main(String[] args) {
		
		String str="#GeeKs01fOr@gEEks07";
		
		int upCount=0;
		int lowcount=0;
		int splCount=0;
		int numCount=0;
		
		int arr[]= new int[4];
		
		for(char ch:str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				upCount++;
			}else if(Character.isLowerCase(ch)){
				lowcount++;
			}else if(Character.isDigit(ch)) {
				numCount++;
			}else  {
				splCount++;
			}
		}
		

		arr[0]=upCount;
		arr[1]=lowcount;
		arr[2]=numCount;
		arr[3]=splCount;
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
