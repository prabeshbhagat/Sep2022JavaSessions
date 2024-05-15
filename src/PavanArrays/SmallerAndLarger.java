package PavanArrays;

import java.util.Arrays;

public class SmallerAndLarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 7, x = 5;
		int	a[] = {1, 2,5, 8, 10, 11, 12, 19};
//		int N = 3, x = 3;
//		int a[] = { 3, 3, 3 };
		int gCount = 0;
		int sCount = 0;
//		int count[] = new int[2];
		int count[]= {0,0};

		for (int i = 0; i < a.length; i++) {
			if (x <= a[i]) {
				//gCount++;
				count[0]+=1;
			}
			if (x >= a[i]) {
				count[1]++;
			}

		}

		//count[0] = gCount;
		//count[1] = sCount;

		System.out.println(Arrays.toString(count));
	}

}
