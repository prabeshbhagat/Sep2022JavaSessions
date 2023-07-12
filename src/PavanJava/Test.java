package PavanJava;

import java.util.ArrayList;

public class Test {
	static  char ch;

	public static void main(String[] args) {

		String str = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String s = "";
			if (Character.isDigit(ch)) {
				s += ch;
				for (int j = i + 1; j < str.length(); j++) {
					char ch1 = str.charAt(j);
					if (Character.isDigit(ch1)) {
						s += ch1;
						i++;
					} else {
						break;
					}
				}
				al.add(s);
			}
			
			

		}

		System.out.println(al);

	}

}
