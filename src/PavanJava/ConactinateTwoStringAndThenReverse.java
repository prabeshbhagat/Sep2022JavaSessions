package PavanJava;

public class ConactinateTwoStringAndThenReverse {

	public static void main(String[] args) {
//		
		String S1 = "Web";
		String S2 = "Automation";
//		
		String s3 = S1 + S2;
		String rev = "";

		for (int i = s3.length() - 1; i >= 0; i--) {
			rev += s3.charAt(i);
		}

		System.out.println(rev);
//		
//		

		// code here
//        String ans ="";
//        String temp = "";
//        for(char c : S2.toCharArray()) {
//            ans = c + ans;
//        }
//        //System.out.println(ans);
//        for(char c : S1.toCharArray()) {
//            temp = c + temp;
//        }
//        System.err.println(ans+temp);

	}

}
