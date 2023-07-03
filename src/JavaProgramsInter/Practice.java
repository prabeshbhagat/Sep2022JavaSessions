package JavaProgramsInter;


public class Practice {

	public static void main(String[] args) {
		String str = "This is a Java Program";
		printEachWordReverse(str);

	}

	public static void printEachWordReverse(String line) {

		// TODO: Also we can use Stacks for this programming question

		String[] a = line.split(" ");
		String reverse = "";
		// String reverseString = "";

		for (int i = 0; i < a.length; i++) {
			int lengthOfEachWord = a[i].length();

			for (int j = lengthOfEachWord - 1; j >= 0; j--) {
				reverse = String.valueOf(a[i].charAt(j));
				System.out.print(reverse);
				// reverseString += reverse;
			}
			System.out.print(" ");
		}

	}

}
