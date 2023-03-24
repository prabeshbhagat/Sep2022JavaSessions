package Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DifferentWaysTravesrseArrayList {

	public static void main(String[] args) {

		// Different ways to traverse the array list :
		// for-each
		// Using for loop
		// Using itrerator( ) in while loop

		ArrayList<Integer> al = new ArrayList<Integer>();
//		al = List.of(10, 67, 34, 89, 23, 45, 99);
		// Using For each
		for (int i : al) {
			System.out.print(i + " ");

		}
		System.out.println();
		// Using for loop
		for (int j = 0; j <= al.size() - 1; j++) {
			System.out.print(al.get(j) + " ");
		}

		// Using iterator
		System.out.println();
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		// Few other options to iterate:
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");

		// 1. using java 8 with for each loop and lambda:

		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});

		// 2. using Iterator:
		Iterator<String> it1 = tvSeries.iterator();

		while (it1.hasNext()) {
			String shows = it1.next();
			System.out.println(shows);
		}

		// 3. using iterator and java 8 lambda and forEachRemaning()

		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});

		// 4. using for each loop:

		for (String show : tvSeries) {
			System.out.println(show);
		}

		// 5. using for loop with order/index:

		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}

		// 6. using a listIterator() to traverse in both the directions

		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while (tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
	}

}
