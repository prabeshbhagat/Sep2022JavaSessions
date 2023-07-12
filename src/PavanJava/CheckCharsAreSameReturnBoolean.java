package PavanJava;

import java.util.HashSet;

public class CheckCharsAreSameReturnBoolean {

	public static Boolean check(String S) {

//		char ch[] = S.toCharArray();
//		for (int i = 0; i < ch.length - 1; i++) {
//			System.out.println("Inside for loop I="+i);
//			System.out.println("ch[i]="+ch[i]);
//			System.out.println("ch[i + 1]="+ch[i + 1]);
//			if (ch[i] != ch[i + 1]) {
//				System.out.println("Inside if loop="+i);
//				System.out.println("ch[i]="+ch[i]);
//				System.out.println("ch[i + 1]="+ch[i + 1]);
//				return false;
//			}
//		}
//		return true;
		

        char[] str= S.toCharArray();
       HashSet<Character> hset =new HashSet<Character>();
       for(char x:str)
       {
           hset.add(x);
       }
       if(hset.size()==1)
       return true;
       
       return false;
        // your code here  

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ggggg";
		boolean b = check(str);
		System.out.println(b);

	}

}
