package PavanJava;

public class RemoveVowelsFromString2 {
	

//
//	String leftString = "";
//	String S = "geeksforgeeks";
//	for (char ch : S.toCharArray()) {
//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//				|| ch == 'O' || ch == 'U') {
//			continue;
//		}else {
//			leftString+=ch;
//		}
//
//	}
//
//	System.out.println(leftString);




	public static void main(String[] args) {

		StringBuilder sb= new StringBuilder();
		String S = "geeksforgeeks";
		for (char ch : S.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				continue;
			}else {
				sb.append(ch);
			}

		}

		System.out.println(sb.toString());
	}
}
