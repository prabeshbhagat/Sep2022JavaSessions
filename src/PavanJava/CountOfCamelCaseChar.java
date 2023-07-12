package PavanJava;

public class CountOfCamelCaseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="dddDGjjjsjjUUHj";
		int count=0;
		for(char ch:str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
