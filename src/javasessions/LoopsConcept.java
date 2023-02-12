package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print 1 to 10
		System.out.println(1);
		System.out.println(2);
		System.out.println(9);
		System.out.println(10);

		// While Loop
		// WAP to Print 1 to 10
		int i = 1;
		while (i <= 10) {
			System.out.println(i++);
			// 1.//System.out.println(i++);
			// 2.//i++;
			// 3.//++i;
			// 4.//i+1;
			// 5.//i+2;//to print al odd numbers only

		}

		// WAp to print 1 to 10 using short & Double
		System.out.println("using Short");
		short s = 1;
		while (s <= 10) {
			System.out.println(s);
			s++;
		}

		System.out.println("using Double");
		double d1 = 1.1;
		while (d1 <= 10.0) {
			System.out.println(d1);
			d1++;
		}

		// WAP to print anything for infinite times

		while (true) {
			System.out.println("Hi");
			break;
		}

		// WAP to print anything for infinite times
		// use case
		// print the msg in display board
//		while (true) {
//			System.out.println("Welcome to Cuttack");
//			
//		}

		// Unreachable code
//		while (false) {
//			System.out.println("Welcome to Cuttack");
//		}

		// use cases of While Loop
		// we use while loop when number of iterations are not fixed
		// 1.page load time out wait for page to load
		// 2.facebook/linkedin infinite scrolling wait for naveens post and than click
		// 3.gmail mail comes after some time,wait for certain amt of time
		// 4.wait for an element to appear(sometimes it takes less time sometimes more)
		// 5.total images /link on the page

		// WAP to print from 1 to 10 with a bye after 5
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			if (num == 5) {
				System.out.println("Bye");
				// break;//adding break in if else
			}
			// break; if we add break here the below line becomes unreachable code
			num++;
		}

		// Use case of while loop
		// for the above program.
		// in linkedin we are scrolling for a post & we will keep scrolling
		// once the post is found we will break and come out of while loop
		System.out.println("++++++++++++++");
		// WAp to print 10 to 1
		int rev = 10;
		while (rev >= 1) {
			System.out.println(rev);
			rev--;
		}
		System.out.println("++++++++++++++");
		// Wap to print even numbers in reverse order betwwen 10 to 1
		int revOd = 10;
		while (revOd >= 1) {
			System.out.println(revOd);
			revOd = revOd - 2;
		}

		System.out.println("+++++++++++++++++++++++++");
		// infinite loop can be generated with any kind of loop
		// its not only applicable with do while

		for (int u = 1; u <= 10; u++) {
			System.out.println(u);
		}
		System.out.println("............");
		// another way
		int v = 1;
		for (; v <= 10;) {
			System.out.println(v);
			v++;
		}

		// by deafult it will cosider true
		// Hence it will generate infinite loop
//		for(;;) {
//			System.out.println("Bye");
//		}

		// use cases of For loop
		// 1.years in dropdown(1-12)
		// 2.footer links in application
		// 3.calendar days
		// 4.seats in flight always fixed

		System.out.println("IIIIIIIIIIIIIIIIIIII");

		// WAP to print even numbers
		// for loop with break
		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}

		// ---java 06----Oct 01 Practice session....do while forloop vs do while nested
		// loops

		System.out.println("Prinitng a to z vertically");
		// char in loop
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

		System.out.println("Prinitng a to z horizontally");
		// char in loop
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}

		System.out.println("Prinitng a to z horizontally with space");
		// char in loop
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}

		System.out.println("Prinitng a to z vertically with char space");
		// char in loop
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + ' ');
		}

		System.out.println("Prinitng a to z asci value by converting to arithmentic operation");
		// char in loop
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + 0);
		}

		System.out.println("Prinitng a to z asci value by casting");
		// char in loop
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println((int) ch);
		}

		System.out.println("Prinitng a to z complete asci table a=97");
		// char in loop
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + "=" + (int) ch);
		}

		System.out.println(" do while ");
		// do-while
		// do & while should come together
		int v1 = 1;
		do {
			System.out.println(v1);
		} while (v1 >= 10);

//		System.out.println("  do while infinite example ");
//		// do-while
//		int v2 = 1;
//		do {
//			System.out.println(v2);
//		} while (v2 <= 10);

		System.out.println("--- using do while print 1-10---- ");
		// do-while
		int v3 = 1;
		do {
			System.out.println(v3);
			v3++;
		} while (v3 <= 10);

		System.out.println("--- using do while print 2-11---- ");
		// do-while
		int v4 = 1;
		do {
			v4++;
			System.out.println(v4);

		} while (v4 <= 10);

//		System.out.println("--- using do while print 1 infinite times---- ");
//		// do-while
//		int v5 = 1;
//		do {
//
//			System.out.println(v5);
//
//		} while (v5 <= 10);
//		v5++;// it will never reach here

//		System.out.println("--- using do while print 1 and kepp increasing by the number till infinite times---- ");
//		// do-while
//		int v6 = 1;
//		do {
//			v6++;
//			System.out.println(v6);
//		} while (true);
//		

		System.out.println("--- using do while print 1 and kepp increasing by the number till infinite times---- ");
		// do-while
		int v7 = 1;
		do {
			
			System.out.println(v7);
			v7++;
			if(v7==5) {
				break;
			}
		} while (true);
		
		//do while use cases:
		//Atleast check the element is present for the 1st time or not
		//than break the loop
		
		

	}

}
