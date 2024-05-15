package PavanBasicStringsGFG;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {

		//String s = "testsample";
		String s = "weareideagen";
		int max=0;
		char ch1=1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = 1;
			for (int j = 0; j < s.length(); j++) {
				if (i != j) {
					if (ch == s.charAt(j)) {
						count++;
					}
				}
			}

			System.out.println(ch + " " + count);
			if(max<count) {
				max=count;
				ch1=ch;
				//System.out.println("max"+max);
			}
			
		}
		System.out.println(ch1);
		

	}

}
