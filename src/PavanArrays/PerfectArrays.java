package PavanArrays;

import java.util.Arrays;

public class PerfectArrays {
	
	
	/*
	 * 
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        int [] rev = new int[n];
        for(int i=0; i<n ;i++){
            rev[i]=a[n-i-1];   
        }
        
        if(Arrays.equals(a,rev)){
            return true;
        }
        else{ 
            return false;
        }
    }
    
	 */

	public static void main(String[] args) {
		int arr[] = { 11, 12, 14 ,12 ,19 ,11 };

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[(arr.length - 1) - i]) {

				flag = true;

			} else {
				flag = false;
				break;
			}

		}
		
		System.out.println(flag);

	}

}
