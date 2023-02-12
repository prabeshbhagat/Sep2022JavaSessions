package javasessions;

public class SwitchCaseLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch than CTRL+SPACE

		String browser = "chrome";
		switch (browser) {
		case "Opera":
			System.out.println("Launch Opera");
			break;

		case "chrome":
			System.out.println("Launch chrome");
			break;

		case "IE":
			System.out.println("Launch IE");
			break;

		default:
			System.out.println("please pass the right browser:");
			break;
		}

		// for the above case it will not check all the value i.e broser
		// wherever it matches it will print(execute) its below statement
		// if nothing matches it will print the default statement

		// there cannot be duplciate in case e.g there cannot be two IE & IE in Value

		System.out.println("========================");

		// Role of Break
		String brwsr = "firefox";
		switch (brwsr) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			// break;
		case "Edge":
			System.out.println("Launch Edge");
			// break;

		default:
			System.out.println("Please pass the right browser");
			break;
		}
		// for the above case if we remove break from all line
		// it will print all print statement
		// if we remove break from edge & below
		// it will print all print statement for edge & below

		System.out.println("--Test whether a case after default case will work or not--");
		String brwsr1 = "Brave";
		switch (brwsr1) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "IE":
			System.out.println("Launch IE");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			// break;
		case "Edge":
			System.out.println("Launch Edge");
			// break;

		default:
			System.out.println("Please pass the right browser");
			break;

		case "Brave":
			System.out.println("Launch Brave");
			// break;

		}

		// for the above thing
		// we can write a case after the default case & it will woek
		// there cannot be 2 deafult cases

		System.out.println("--Check if user passes key value in Caps & it should work--");
		String brwsr2 = "Brave";
		switch (brwsr2.toLowerCase()) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "ie":
			System.out.println("Launch IE");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			// break;
		case "edge":
			System.out.println("Launch Edge");
			// break;

		default:
			System.out.println("Please pass the right browser");
			break;

		case "brave":
			System.out.println("Launch Brave");
			// break;

		}

		// Switch case Practice
		// weekdays
		// env
		// float & double//it will not give the appropriate result
		// if else inside Switch
		// nested switch case version inside browser

		// weekdays
		String weekdays = "Saturday";
		switch (weekdays) {
		case "monday":
			System.out.println("Its a Working day");
			break;
		case "tuesday":
			System.out.println("Its a Working day");
			break;
		case "wednesday":
			System.out.println("Its a Working day");
			break;
		case "thursday":
			System.out.println("Its a Working day");
			break;
		case "saturday":
			System.out.println("Its time to work with family & yourself");
			break;
		case "sunday":
			System.out.println("Its time to work with friends");
			break;
		default:
			System.out.println("Please pass the corerct day :" + weekdays);
			break;
		}

		// if else under switch
		// nested switch
		String browsers = "opera";
		switch (browsers) {
		case "chrome":
			System.out.println("launch chrome");
			String version = "104";
			switch (version) {
			case "104":
				System.out.println("Latest Version");
				break;

			default:
				System.out.println("pass the right version");
				break;
			}
			break;
		case "opera":
			System.out.println("launch opera");
			if (true) {
				System.out.println("Test if else under switch");
			}
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		default:
			System.out.println("pass the right boroser");
			break;
		}

		// Switch case with Float,Double,Boolean
		// Cannot switch on a value of type double/float/boolean/long.
		// Only convertible int values, strings or enum variables are permitted
		//Switch case will work for byte,short,char 
		
//		double d=12.33;
//		switch (d) {
//		case 15.33:
//			
//			break;
//
//		default:
//			break;
//		}

//		boolean bl=true;
//		switch (bl) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		
		char c='a';
		switch (c) {
		case 'a':
			System.out.println("a is a Vowel");
			break;
		case 'e':
			System.out.println("e is a Vowel");
			break;
		case 'i':
			System.out.println("i is a Vowel");
			break;
		case 'o':
			System.out.println("o is a Vowel");
			break;
		case 'u':
			System.out.println("u is a Vowel");
			break;
		default:
			System.out.println("It is not a Vowel"+c);
			break;
		}

	}

}
