package PavanJava;

public class CheckForBinary {

	public static void main(String[] args) {
		
		
		String str="100b";
		boolean flag=false;
		for(char ch:str.toCharArray()) {
			if(ch>='0'  && ch<='1') {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		
		System.out.println(flag);
		

	}

}
