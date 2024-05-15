package AaInterviewQuestinesOnly;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] a = { 1, 2, 3, 4, 5 };
//		ArrayList<Integer> arr = new ArrayList<>();
//		for (int i = a.length - 1; i >= 0; i--) {
//			arr.add(a[i]);
//		}
//		System.out.println(arr);

		int[] a = { 10, 20, 30, 40, 50,100 };
		int arr[] = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			int j = a.length - 1;
			arr[j - i] = a[i];
		}

		System.out.println(Arrays.toString(arr));
	}

}
