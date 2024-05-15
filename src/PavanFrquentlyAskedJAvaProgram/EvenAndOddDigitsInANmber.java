package PavanFrquentlyAskedJAvaProgram;

public class EvenAndOddDigitsInANmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14567877;
		
		int evenCount = 0;
		int oddCount = 0;

		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}

			num = num / 10;

		}
		
		System.out.println(evenCount);
		System.out.println(oddCount);

	}

}
