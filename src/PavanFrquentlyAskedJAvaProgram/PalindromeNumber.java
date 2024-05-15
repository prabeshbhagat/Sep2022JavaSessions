package PavanFrquentlyAskedJAvaProgram;

public class PalindromeNumber {

	public static void main(String[] args) {

		int OrgNum = 121;
		int num = OrgNum;
		int rev = 0;
		boolean flag = false;
		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}

		System.out.println(rev);
		if (OrgNum == rev) {
			flag = true;
		}
		System.out.println(flag);

	}

}
