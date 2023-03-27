package opp_encapsulation15;

public class TestingConstrucor15 {

	int a;
	int b;
	int c;

	public TestingConstrucor15() {
		this(1, 9);
		System.out.println("hi");
	}

	public TestingConstrucor15(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public TestingConstrucor15(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static void main(String[] args) {
		TestingConstrucor15 t = new TestingConstrucor15();
		System.out.println(t.a + " " + t.b + " " + t.c);
	}

}
