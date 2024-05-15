package PavanArrays;

public class test {

	public static void main(String[] args) {
		
		class Solution {
		    public boolean containsDuplicate(int[] nums) {

		        int len = nums.length;

		        boolean flag = false;

		        for(int i=0; i<len; i++){


				int arr[] = { 11, 12, 14 ,12 ,19 ,19 };

				boolean flag = false;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == arr[i + i]) {

						flag = false;
						break;

					} 

				}
				
				System.out.println(flag);

			
			
			
			
		       
		    }
		  
		// TODO Auto-generated method stub

	}

}
