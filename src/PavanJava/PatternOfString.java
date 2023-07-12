package PavanJava;

import java.util.ArrayList;

public class PatternOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcdefghj";
//		for(int i=str.length()-1;i>=0;i--) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(str.charAt(j));
//			}
//			System.out.println();
//		}
		
		
		ArrayList<String> list=new ArrayList<String>();
		for(int i=str.length()-1;i>=0;i--) {
			list.add(str.substring(0, i));
		}
		System.out.print(list);
	}

}
