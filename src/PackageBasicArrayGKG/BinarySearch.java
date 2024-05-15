package PackageBasicArrayGKG;

public class BinarySearch {

	public static void main(String[] args) {
		
		int n = 5;
		int a[] = {1 ,2, 3, 4 ,4} ;
		int K = 4;
		int index=-1;
		
		for (int i = 0; i < n; i++) {
			if(a[i]==K) {
				index=i;
			}
		}
		
		System.out.println(index);

	}

}
