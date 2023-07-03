package JavaProgramsInter;

import java.util.ArrayList;

public class RealPageMoveIndexByOneUsingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);

		moveIndexByOne(values);

		System.out.println(values);
	}

	public static void moveIndexByOne(ArrayList<Integer> list) {
		int lastValue = list.get(list.size() - 1);
		for (int i = list.size() - 1; i > 0; i--) {
			list.set(i, list.get(i - 1));
		}
		list.set(0, lastValue);
		
		// Collections.rotate(numbers, 2); using collections
	}

}
