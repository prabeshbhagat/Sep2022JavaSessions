package opp_encapsulation15;

public class TestingConstructor15 {

	int a;
	int b;
	int c;

	public TestingConstructor15() {
		this(1, 9);
		System.out.println("hi");
	}

	public TestingConstructor15(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public TestingConstructor15(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static void main(String[] args) {
		TestingConstructor15 t = new TestingConstructor15();
		System.out.println(t.a + " " + t.b + " " + t.c);
	}

}
