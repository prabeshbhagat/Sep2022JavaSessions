package PavanArrays;

import java.util.Arrays;

public class ContainsDuplicate {

	public static boolean duplicateCheck() {

		int a[] = { 11, 12, 19, 13, 11, 193 };
		Arrays.sort(a);

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				return true;
			}

		}
		return false;

	}

	public static void main(String[] args) {
		boolean flag=duplicateCheck();
		System.out.println(flag);
	}
}
