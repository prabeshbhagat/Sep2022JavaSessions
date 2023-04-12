package ExceptionHandling20_21;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {

		TryCatchBlock obj = new TryCatchBlock();
		obj = null;

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			obj.name = "Tom";
			int a = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Error e) {
			System.out.println("Error is coming");
			e.printStackTrace();
		}

		System.out.println("Bye");
		
		
		int a[]=new int[4];
		try {
			a[6]=10;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		

	}

}
