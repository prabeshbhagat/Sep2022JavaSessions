package javasessions;

import java.util.Arrays;

public class ArrayConcept07 {

	public static void main(String[] args) {

		int j = 10;
		j = 20;
		j = 30;
		System.out.println(j);

		// Requirement =Want to store multiple data in single variable
		// here we will use array

		// Array can hold similar type of data

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[2]);
		System.out.println(i[2] + i[3]);
		// System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		// System.out.println(i[-1]);//AIOB
		System.out.println(i);// [I@379619aait will give some garbage value
		System.out.println(Arrays.toString(i));

		// How to traverse an array
		// How to iterate an array
		// using for loop to print all the values of the array

		for (int k = 0; k <= 3; k++) {
			System.out.println(i[k]);
		}

		// the above one is hardcoded
		// how to find the length of array
		System.out.println("-----------");
		int len = i.length;
		System.out.println(len);
		for (int k = 0; k < len; k++) {
			System.out.println(i[k]);
		}

		// iterate the above array using while loop
		int o = 0;
		while (o < i.length) {
			System.out.println(i[o]);
			o++;
		}

		// using if & break with for loop

		for (int k = 0; k < len; k++) {
			System.out.println(i[k]);
			if (i[k] == 20) {
				System.out.println("Bye..." + i[k]);
				break;
			}
		}

		System.out.println("---------------------");

		// array can alos be created with byte ,short int ,long
		// double
		double d[] = new double[2];
		d[0] = 10.22;
		d[1] = 14.22;
		System.out.println(Arrays.toString(d));

		// using char
		char c[] = new char[3];
		c[0] = 'A';
		c[1] = '6';
		c[2] = '$';
		for (int u = 0; u <= c.length - 1; u++) {
			System.out.println(c[u]);
		}

		System.out.println("Using string array");
		String st[] = new String[3];
		st[0] = "Astami";
		st[1] = "Navami";
		st[2] = "Dasami";

		System.out.println(Arrays.toString(st));
		System.out.println("St length =" + st.length);

		for (int k = 0; k <= st.length - 1; k++) {
			System.out.println(st[k]);
			if (st[k].equals("Dasami")) {
				System.out.println(st[k] + " Its Dusheraa...." + k);
			}
		}

		// For each loop
		// e is not representing index
		// e is representing values of array

		String emp[] = new String[3];
		emp[0] = "Tom";
		emp[1] = "Peter";
		emp[2] = "John";

		// String is type of array whatever decalred abaove
		// e is variable name
		// emp is array name
		// it will auto calculate length
		for (String e : emp) {
			System.out.println(e);
			if (e.equals("Peter")) {
				System.out.println("Bye..");
			}
		}

		System.out.println("---------------------");

		// Array Literals:Static array
		int num[] = { 1, 6, 5, 15, -3 };
		System.out.println(num.length);
		System.out.println("Li" + 0);
		System.out.println("Hi " + (num.length - 1));
		
		// String Literals:Static array
		String str[]= {"Java","Python","Dot net"};
		for(int v=0;v<=str.length-1;v++) {
			System.out.println(v+":"+str[v]);
		}
		//Object array
		Object empData[]=new Object[5];
		empData[0]="Vani";
		empData[1]=10;
		empData[2]=1000.22;
		empData[3]=true;
		empData[4]='F';
		
		System.out.println(Arrays.toString(empData));
		
		//foreach loop
		for(Object e:empData) {
			System.out.println(e);
		}
		
		//Object Literals
		
		Object userInfo[]= {"Bulu",500,44.55,'M',false};
		System.out.println(userInfo.length);
		System.out.println(Arrays.toString(userInfo));
		
		
		
		
	}

}
