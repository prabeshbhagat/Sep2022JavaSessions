package javasessions;

public class MainMethodOverloading14 {


	public static void main(String p[]) {
		System.out.println("hi");
		MainMethodOverloading14.main(10);
		MainMethodOverloading14.main(10, "Tom");
	}
	
	public static void main(String p) {
		System.out.println("hi java");
		System.out.println(p);
	}
	
	public static void main(int i) {
		System.out.println("bye");
		System.out.println(i);
	}
	
	public static void main(int i, String p) {
		System.out.println("hello");
		System.out.println(i+p);
	}

}
