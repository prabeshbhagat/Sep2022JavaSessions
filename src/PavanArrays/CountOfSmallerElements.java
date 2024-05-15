package PavanArrays;

public class CountOfSmallerElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 4, 5, 8, 10};
		int n=6;
		int x=10;
		int count=0;
		for(int i=0;i< n;i++) {
			if(a[i]<=x) {
				count++;
			}
		}
		System.out.println(count);

	}

}
