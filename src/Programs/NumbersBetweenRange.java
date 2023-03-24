package Programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumbersBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(between(5,10)));
	}
	
	public static int[] between(int a,int b) {
		 return IntStream.rangeClosed(a, b).toArray();
	}

}
 