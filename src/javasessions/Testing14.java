package javasessions;

public class Testing14 {

	public void m1() {
		System.out.println("m1");
		m2();

	}

	public void m2() {
		System.out.println("m2");
		m3();

	}

	public void m3() {
		System.out.println("m3");

	}

	public static void main(String[] args) {

		Testing14 obj = new Testing14();
		obj.m1();

	}

}
