package AaInterviewQuestinesOnly;

public class MissingNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int N = 1;
		int a[] = {1};
		
		
//		for(int i=0;i<N-1;i++) {
//			if((a[i]+1)!=a[i+1]) {
//				System.out.println(a[i]+1);
//				break;
//			}
//		}
		
		int total=N*(N+1)/2;
		int sum=0;
		
		for(int i=0;i<N;i++) {
			sum+=a[i];
			System.out.println(sum);
		}
		
		
		System.out.println(total);
		System.out.println(sum);
		System.out.println(total-sum);
	}

}
