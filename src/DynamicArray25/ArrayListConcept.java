package DynamicArray25;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());
		ar.add(100);//0
		ar.add(200);//1
		ar.add("Java");
		System.out.println(ar.size());
		ar.add('a');
		ar.add(12.33);
		ar.add(true);//5
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(5));
		
		//Size
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//System.out.println(ar.get(8));IOB
		
		
		//Generics in arraylist
		ArrayList<String> stNames= new ArrayList<String>();
		stNames.add("Tom");
		stNames.add("Pater");
		stNames.add("Ravi");
		stNames.add("Sham");
		stNames.add("Sham");
		
		System.out.println(stNames.size());
		
		
		ArrayList<Integer> stEmpId= new ArrayList<Integer>();
		stEmpId.add(10);
		stEmpId.add(20);
		stEmpId.add(30);
		stEmpId.add(40);
		
		System.out.println(stEmpId.size());
		
		
		ArrayList<Object> empData= new ArrayList<Object>();
		empData.add(12345);
		empData.add("Prabesh");
		empData.add(true);
		empData.add(156.22);
		System.out.println(empData);
		
		for(int i=0;i<empData.size();i++) {
			System.out.println(empData.get(i));
		}
		
		for(Object e :empData) {
			System.out.println(e);
		}
		
		

	}

}
