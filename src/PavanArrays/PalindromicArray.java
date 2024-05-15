package PavanArrays;

public class PalindromicArray {

	public static void main(String[] args) {
        
		int n = 4;
		int a[] = {333 ,2222 ,11458611,55555};
	int val=0;
	
	for(int i=0;i< n;i++) {
		
		String str=Integer.toString(a[i]);
		String rev="";
		for(int j=str.length()-1;j>=0;j--) {
			rev+=str.charAt(j);
		}
		if(str.equals(rev)) {
			val=1;
		}else {
			val=0;
			break;
		}
	}
	
	System.out.println(val);


           //add code here.
    }

}
