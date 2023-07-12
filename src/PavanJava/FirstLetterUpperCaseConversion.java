package PavanJava;

public class FirstLetterUpperCaseConversion {

	public static String capitalizeWord(String s) {

		if (s == null) {
			return null;	
		}
		
		if (s.length() == 1) {
			return s.toUpperCase();
		}

		String result = "";
		String[] words = s.split("\\s");
						//i
		for (String w : words) {
			String first = w.substring(0, 1).toUpperCase();
			String restString = w.substring(1);
			result = result + first + restString + " ";

		}

		return result.trim();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = null;
		String str1 = capitalizeWord(str);
		System.out.println(str1);

	}

}
