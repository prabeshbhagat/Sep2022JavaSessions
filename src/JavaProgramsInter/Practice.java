package JavaProgramsInter;

import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println("Original values "+arr);
		moveIndexByOne(arr);
		System.out.println("Values moved by one "+arr);
	}

	public static void moveIndexByOne(List<Integer> list) {
		int lastValue = list.get(list.size() - 1);

		for (int i = list.size() - 1; i > 0; i--) {
			list.set(i, list.get(i - 1));
			System.out.println("    "+i);
		}

		list.set(0, lastValue);

	}

}
