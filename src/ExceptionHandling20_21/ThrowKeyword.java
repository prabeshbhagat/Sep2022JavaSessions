package ExceptionHandling20_21;

public class ThrowKeyword {

	// Custom Exception

	public static void main(String[] args) {

		String data = null;// reading from excel /prop
		if (data == null) {
			try {
				throw new Exception("DataNotFound Exception");
			} catch (Exception e) {
				System.out.println("Data exception is coming..");
				e.printStackTrace();
			}

		}

		System.out.println("Logout.....");

	}

}
