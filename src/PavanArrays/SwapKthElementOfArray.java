package PavanArrays;

import java.util.Arrays;

public class SwapKthElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int a[] = { 1,2,3 };
		int n = 3;
		int k = 1;
		int l = k - 1;
		int temp = 0;
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < n; i++) {
			if (i == l) {

				temp = a[l];
				a[l] = a[n - k];
				a[n - k] = temp;

			}
		}

		System.out.println(Arrays.toString(a));

	}

}
