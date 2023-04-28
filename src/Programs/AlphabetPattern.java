package Programs;

public class AlphabetPattern {

	public static void main(String[] args) {
		
		
		//A
		//AB
		//ABC
		//ABCD
		//ABCDE

		System.out.println("--------------------------------");
		for(char c='A';c<='E';c++) {
			for(char d='A';d<=c;d++) {
				System.out.print(d);
			}
			System.out.println();
		}
		
		int alpha=65;
		System.out.println("--------------------------------");
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j));
			}
			System.out.println();
		}
		
		
		
		
	}

}
