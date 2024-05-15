package AaInterviewQuestinesOnly;

import java.util.Arrays;

public class ReverseWordsInagivenString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "i.like.this.program.very.much";
    // code here 
        int n=S.length();
        String temp="";
        String res="";
        
        for(int i=0;i<n;i++) {
            if(S.charAt(i)!='.') {
                temp+=S.charAt(i);
            System.out.println(temp);
            }
            else {
                temp='.'+temp;
                System.out.println(temp);
                res=temp+res;
                System.out.println(res);
                temp="";
                System.out.println(temp);
                
            }    
        }
        System.out.println(temp+res);
    
		
		
	}

}
