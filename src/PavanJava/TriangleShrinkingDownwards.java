package PavanJava;

public class TriangleShrinkingDownwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Smarta";

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String str1="";
			for (int k = 1; k <= i; k++) {
				str1+=".";
			}
			
			for (int j = i; j < ch.length; j++) {
				str1+=ch[j];
			}

			System.out.println(str1);

		}

	}
	
	
	/*
	 * Using string Builder
	 * 
	 * 
	 * 


    static String triDownwards(String st){
        // code here
        StringBuilder s=new StringBuilder(st);
         System.out.println(s);
        for(int i=0;i<s.length()-1;i++){
            s.setCharAt(i,'.');
            System.out.println(s);
        }
        return "";
    
    }


	public static void main(String[] args) {
		String str=triDownwards("Smart");
		System.out.println(str);
	}


	 */

}
