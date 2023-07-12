package PavanJava;

public class DeleteAlternateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Playright";
		String postDeletion="";
		
		for(int i=0;i<=str.length();i++) {
			if(i%2==0) {
				postDeletion=postDeletion+str.charAt(i);
			}
		}
		System.out.println(postDeletion);

	}

}
