package PavanJava;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
        
        String leftString="";
        String S="I ";
		for (char ch : S.toCharArray()) {
			if (ch != 'a' && ch != 'e' &&  ch != 'i' &&  ch != 'o' &&  ch != 'u' &&  ch != 'A' &&  ch != 'E' &&  ch !='I'
					&&  ch != 'O' &&  ch != 'U') {
				leftString=leftString+ch;
			}
				
			

		}
		
		
		System.out.println(leftString);
    }
}
