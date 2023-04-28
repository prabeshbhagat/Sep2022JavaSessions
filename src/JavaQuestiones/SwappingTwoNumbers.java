package JavaQuestiones;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=200;
		
		System.out.println("Before Swapping:"+a);
		System.out.println("Before Swapping:"+b);
		System.out.println("---------------------");
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping:"+a);
		System.out.println("After Swapping:"+b);

	}

}
