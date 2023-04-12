package ExceptionHandling20_21;

public class ThrowsKeyword {

	public void m1() {
		System.out.println("M1 method ");
		m2();
	}

	public void m2() {
		System.out.println("M2 method ");
		try {
			m3();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

	public void m3() throws ArithmeticException  {
		System.out.println("M3 method ");
		int a=9/0;
	}

	public static void main(String[] args) {
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.m1();
		System.out.println("Bye");
	}

}
