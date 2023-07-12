package PavanJava;

import java.util.ArrayList;
import java.util.List;

public class ExtractTheIntegersFromString {

	public static void main(String[] args) {
		String str = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta5";

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String s = "";
			if (ch >= '0' && ch <= '9') {
				s += ch;
				for (int j = i + 1; j < str.length(); j++) {
					char ch1 = str.charAt(j);
					if (ch1 >= '0' && ch1 <= '9') {
						s += ch1;
						i++;
					} else {
						break;
					}
				}
				al.add(Integer.parseInt(s));
			}
		}
		System.out.println(al);
		
		int sum=0;
		for(int k = 0; k < al.size(); k++) {
			
			 sum+=al.get(k);
		}
		System.out.println(sum);
	}

}
