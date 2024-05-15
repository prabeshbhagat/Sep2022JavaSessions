package JavaPrograms100;

//identify the count of letter in sentence
public class letter_find_03 {

	public static int total(String str, char ch) {
		String strLC = str.toLowerCase();
		char ch1[] = strLC.toCharArray();
		int count = 0;
		for (char ch2 : ch1) {
			if (ch2 == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation testing";
		char ch = 't';
		System.out.println(total(str,ch));
	}

}
