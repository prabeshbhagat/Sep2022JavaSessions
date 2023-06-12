package JavaProgramsInter;

import java.util.Arrays;

public class RealPageMoveIndexByOne {

	public static void main(String[] args) {

		int[] values = { 10, 20, 30, 40, 50 };
		moveIndexByOne(values);
		System.out.println(Arrays.toString(values));
	}

	public static void moveIndexByOne(int[] arr) {
		int lastValue = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lastValue;
	}

}
