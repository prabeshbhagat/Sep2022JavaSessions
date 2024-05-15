package PavanFrquentlyAskedJAvaProgram;

import java.util.Arrays;

public class LargestInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int A[] = {14, 8, 7, 56, 90};
		
		for(int i=0;i<A.length-1;i++) {
			if(A[i]>A[i+1]) {
				int temp=0;
				temp=A[i];
				A[i]=A[i+1];
				A[i+1]=temp;
			}
		}
		System.out.println(A[n-1]);
		System.out.println(Arrays.toString(A));

	}

}
