package JavaPrograms100;

public class StringReversal04 {

	public static void main(String[] args) {
		String str = "testing";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}
