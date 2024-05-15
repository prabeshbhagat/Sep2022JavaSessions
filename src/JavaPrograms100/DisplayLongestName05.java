package JavaPrograms100;

public class DisplayLongestName05 {

	static String longest(String names[], int n) {
		String longest = null;
		int len = 0;

		for (int i = 0; i < n; i++) {

			int len1 = names[i].length();
			if (len < len1) {
				longest = names[i];
				len = len1;
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		String names[] = { "Geeksfor", "Geeks", "GeeksGGeeksGeeksforGeekseeksforGeeks", "GeeksforGeek",
				"GeeksforGeeks" };
		int len = names.length;
		String longest = longest(names, len);
		System.out.println(longest);

	}

}
