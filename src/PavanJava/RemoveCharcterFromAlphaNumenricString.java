package PavanJava;

public class RemoveCharcterFromAlphaNumenricString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "1212sdfafv";
		String str;
		
		str=S.replaceAll("[A-Za-z]","");
		System.out.println(str);
//		
//		for(char ch:S.toCharArray()) {
//			if(Character.isDigit(ch)) {
//				str+=ch;
//			}
//		}
//		System.out.println(str);
	}

}
