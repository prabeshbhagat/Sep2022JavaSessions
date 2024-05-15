package PackageBasicArrayGKG;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 5;
		int A[] = {1,2,5,4,0};
		int	B[] = {8,7,8,0,0};
		
		/*
		 * 
		Arrays.sort(A);
		Arrays.sort(B);
        System.out.println(Arrays.equals(A, B));
		 */
		boolean flag=false;
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<N;j++) {
				if(A[i]==B[j]) {
					flag=true;
				}else {
					flag=false;
				}
			}
			
			
			
		}
		
		System.out.println(flag);
		
	}

}
