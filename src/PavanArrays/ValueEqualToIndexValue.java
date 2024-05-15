package PavanArrays;

import java.util.ArrayList;
import java.util.List;

public class ValueEqualToIndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 5;
		int	Arr[] = {15, 2, 45, 4, 7};
		List<Integer> l= new ArrayList<>();
		
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]==(i+1)) {
				l.add(Arr[i]);
			}
		}
		System.out.println(l);

	}

}
