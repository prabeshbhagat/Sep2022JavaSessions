package JavaQuestiones;

public class LargestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=1000;
		int b=1000;
		int c=1000;
		
		if(a>b && a>c) {
			System.out.println("a is greater :"+a);
		}else if(b>c) {
			System.out.println("b is greater :"+b);
		}else {
			System.out.println("c is greater :"+c);
		}
		
		if(a>=b) {
			if(a>=c) {
				System.out.println("a is greater :"+a);
			}else {
				System.out.println("c is greater :"+c);
			}
		}else {
			if (b>=c) {
				System.out.println("b is greater :"+b);
			}else {
				System.out.println("c is greater :"+c);
			}
			
		}
			
	}

}
