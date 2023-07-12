package PavanJava;

public class ConvertListOfChaIToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch[]= {'a','v','c','d'};
		String str="";
		for(char c:ch) {
			str=str+c;
		}
		
//		for(int i=0;i<ch.length;i++) {
//			str=str+ch[i];
//		}
		System.out.println(str);
		
		String s=new String(ch);

	}

}
