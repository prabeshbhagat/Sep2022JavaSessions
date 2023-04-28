package StringConcept23;

import java.util.Arrays;

public class StringManipulation23_24 {

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
		String t1 = "Hello World";//scp 1 obj
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
		
		String s5=new String("Hello");
		//s5+="Hi";
		
		System.out.println(s5+"Hi");
		System.out.println(s5);
		
		String z1=new String("Java");
		String z2=new String("Java");
		
		System.out.println(z1.equals(z2));//true
		System.out.println(z1==z2);//false

		StringBuilder sb1= new StringBuilder("Cypress");
		StringBuilder sb2= new StringBuilder("Cypress");
		System.out.println(sb1.equals(sb2));//true
		System.out.println(sb1==sb2);//false
		
		System.out.println(sb1.toString().equals(sb2.toString()));//true
		System.out.println((sb1.toString())==(sb2.toString()));//false
		
		String v1="Play";
		StringBuilder v2= new StringBuilder(v1);
		v2.append("Right");
		System.out.println(v2);
		
		
		String h1="Java_Selenium_Python_Tesing_Dotnet";
		String h2[]=h1.split("_");
		System.out.println(h2[0]);
		System.out.println(h2[1]);
		System.out.println(h2[2]);
		System.out.println(h2[3]);
		System.out.println(h2[4]);
		//System.out.println(h2[5]);
		
		
		System.out.println("------------------------------");
		String h3="xXJavaXxXSeleniumXxXPythonXxXTesingXxXDotnetXxX";
		String h4[]=h3.split("xX");
		System.out.println(h4[0]);
		System.out.println(h4[1]);
		System.out.println(h4[2]);
		System.out.println(h4[3]);
		System.out.println(h4[4]);
		//System.out.println(h4[6]);
		
		
		String h5="Ishan_32_Batsman_MI";
		String h6[]=h5.split("_");
		System.out.println(Arrays.toString(h6));
		
		
		//1.Reverse a string using String Builder
		String test="Selenium";
		StringBuilder sb11=new StringBuilder(test);
		System.out.println(sb11.reverse());
		System.out.println(test.length());
		
		String rev = "";
		for(int i=test.length()-1;i>=0;i--) {
			rev=rev+test.charAt(i);
		}
		System.out.println(rev);
		
		//SubString
		String messg="your username is prabeskkbk";
		String messg1=messg.substring(8);
		String messg2=messg.substring(8,15);
		System.out.println(messg1);
		System.out.println(messg2);
		
		String messg3=messg.substring(messg.indexOf("is")+3);
		String messg4=messg.substring(messg.indexOf("is")+3,messg.length());
		
		System.out.println(messg3);
		System.out.println(messg4);
		
		System.out.println("-------------------------");
		String messg5="username of prabeskkbk who is active";
		System.out.println(messg5.indexOf("of")+2);
		System.out.println(messg5.indexOf("who"));
		String messg6=messg5.substring(messg5.indexOf("of")+3);
		String messg7=messg5.substring(messg5.indexOf("of")+3,messg5.indexOf("who")-1);
		System.out.println(messg6);
		System.out.println(messg7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
