package JavaQuestiones;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch='a';//User Input
		
		if( ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ) {
			System.out.println("The char is vowel :"+ch);
		}else {
			System.out.println("The char is Consonant :"+ch);
		}
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("the char is vowel :"+ch);
			break;

		default:
			System.out.println("the char is Consonant :"+ch);
			break;
		}


	}

}
