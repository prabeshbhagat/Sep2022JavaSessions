package DynamicArray25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> marksList=new ArrayList();
		marksList.add(100);//0
		marksList.add(150);//1
		marksList.add(200);//2
		marksList.add(250);//3
		marksList.add(300);//4
		//marksList.add(null);
		
		System.out.println(marksList.get(4));
		System.out.println(marksList.size());
		System.out.println(marksList);
		System.out.println(marksList.remove(1));
		System.out.println(marksList);
		marksList.add(0, 999);
		System.out.println(marksList);
		
		Collections.sort(marksList);
		System.out.println(marksList);
		Collections.swap(marksList, 2, 4);
		System.out.println(marksList);
		
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ishan");//0
		names.add("Arjun");//1
		names.add("Suyash");//2
		names.add("Mark");//3
		names.add("Pujii");//4
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		//marksList.addAll(names);error
		
		ArrayList<String> subject=new ArrayList<String>();
		subject.add("Java");//0
		subject.add("Go");//1
		subject.add("C#");//2
		subject.add("Python");//3
		subject.add("Ruby");//4
		
		
		System.out.println(subject.addAll(names));
		subject.addAll(names);
		System.out.println(subject);
		
		List<String> ar2=Arrays.asList("INR","EUR","USD","RUP");
		System.out.println(ar2);
		
		
		//top casting
		
		//convert static into Dynamic array
		String teams[]= {"DC","CSK","GL","RR","RCB"};
		List<String> teamsList=Arrays.asList(teams);
		System.out.println(teamsList);
		System.out.println(teamsList.size());
		//System.out.println(teams.length);
		
		
		ArrayList<Integer> ar9=new ArrayList<Integer>();//Vc=10//Pc=0
		ArrayList<Integer> ar8=new ArrayList<>(5);//Vc=5(As declared in const)//Pc=0

	}

}
