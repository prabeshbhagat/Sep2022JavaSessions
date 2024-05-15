package PavanJava;

public class RemoveVowelsFromString {

	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		String leftString = "";
		String S = "geeksforgeeks";
		for (char ch1 : S.toCharArray()) {
			if (!isVowel(ch1)) {
				leftString = leftString + ch1;
			}

		}

		System.out.println(leftString);
	}
}
