package PavanJava;

import java.util.ArrayList;

public class Test {


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

}
