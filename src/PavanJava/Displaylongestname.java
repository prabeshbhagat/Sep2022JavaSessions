package PavanJava;

public class Displaylongestname {

	public static void main(String[] args) {
		String names[] = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks123" };
		String long1 = longest(names, 5);
		System.out.println(long1);
	}

	public static String longest(String names[], int n) {

		int len = 0;
		String longest ="";
		// int small=0;
		for (int i = 0; i < n; i++) {
			String name = names[i];
			int size = name.length();
			if (names[i].length() > len) {
				len = names[i].length();
				longest = names[i];
			}
			// System.out.println(large);

		}
		return longest;

	}

}
