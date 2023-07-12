package MyArrayPrograms;

public class SecondLargestInAIntArray {

	public static void main(String[] args) {

		int arr[] = { 12, 35, 1, 10, 340, 1 };

		int largest = 0;
		int scndLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
			
			if ( scndLargest!= largest && scndLargest <arr[i]) {
				scndLargest = arr[i];
			}
		}
		
		

		System.out.println(largest);
		System.out.println(scndLargest);
		
		
		
		
		class Solution {
		    int print2largest(int arr[], int n) {
		        // code here
		        int largest = arr[0];
		        int slargest = -1;
		        for(int i=1;i<n;i++){
		            if(arr[i]>largest){
		                slargest = largest;
		                largest=arr[i];
		            }
		            if(arr[i]<largest && arr[i]>slargest){
		                slargest = arr[i];
		            }
		        }
		        return slargest;
		    }
		}

	}

}
