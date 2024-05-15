package PavanArrays;

import java.util.Arrays;

public class EliminateTwoGreaterElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2, 8, 7, 1, 5};
		int large=0;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		long[] l=new long[a.length-2];
		
		for(int i = 0; i < a.length-2; i++) {
			l[i]=a[i];
			
		}
		System.out.println(Arrays.toString(l));
		
		
		

	}

}
