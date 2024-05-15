package JavaPrograms100;

public class reverseWordsDay2 {

	public static void main(String[] args) {

		String str = "i.like.this.program.very.much";

		String temp[] = str.split("[.]");
		String rev = temp[temp.length - 1];
		for (int i = temp.length - 2; i >= 0; i--) {
			rev = rev + "." + temp[i];
		}

		System.out.println(rev);

	}

}
