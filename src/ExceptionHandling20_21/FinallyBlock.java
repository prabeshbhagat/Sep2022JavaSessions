package ExceptionHandling20_21;

public class FinallyBlock {

	public static void main(String[] args) {

		try {
			int a = 9 / 3;

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Inside Finally ...");
		}

	}
	

}
