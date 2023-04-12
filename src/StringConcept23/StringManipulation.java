package StringConcept23;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "testing";
		String s1 = "2";
		String str = "Hi This is Tata iPL and i am so happy......";

		System.out.println(str.length());
		int len = str.length();
		int li = 0;
		int hi = len - 1;

		System.out.println("Li..." + li);
		System.out.println("Hi..." + hi);
		System.out.println("Length :" + len);

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));
		// System.out.println(str.charAt(33));
		// StringIndexOutOfBoundsException

		System.out.println(str.indexOf('i'));// 1st occurence
		System.out.println(str.indexOf('i', (str.indexOf('i')) + 1));// 2nd occurence
		System.out.println(str.indexOf('i', (str.indexOf('i', (str.indexOf('i')) + 1)) + 1));

		System.out.println(str.indexOf("This"));// 3
		System.out.println(str.indexOf("Delhi"));// 3

		String mesg = "Welcome Prabesh";
		if (mesg.indexOf("Prabesh") != -1) {
			System.out.println("Valid Username");
		} else {
			System.out.println("Invaid Username");
		}

		// Comparision
		// String Literals
		String t1 = "Hello World";
		String t2 = "Hello World";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1 == t2);

		String t3 = new String("Hello Prabesh");// SCP+Heap//2 objects will be created
		String t4 = "Hello Prabesh";// 0 obj will be created

		System.out.println(t3.equals(t4));
		System.out.println(t3 == t4);

		// case 1
		String p1 = "hello testing1";
		System.out.println(p1 + "java1");// hello testingjava
		System.out.println(p1);// hello testing

		// case 2
		String q1 = "hello testing2";
		String q2 = q1 + "java2";//
		System.out.println(q1);
		System.out.println(q2);

		// case 3
		String r1 = "hello testing3";
		r1 = r1 + "java3";//
		System.out.println(r1);
		System.out.println(q2);

	}

}
