package JavaPrograms100;

public class removeTrailingZeros {

	public static void main(String[] args) {
		String inputNumber="1234500";
		System.out.println("String withoiut trailing zeros="+removeTrailingzeros(inputNumber));
	}

	public static String removeTrailingzeros(String number) {

		int countzero = 0;
		for (int i = number.length() - 1; i > 0; i--) {
			if (number.charAt(i) == '0') {
				countzero++;
			} else {
				break;
			}
		}

		return number.substring(0, number.length() - countzero);

	}

}
