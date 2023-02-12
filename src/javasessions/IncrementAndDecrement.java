package javasessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//++ increase the value by one
		//-- decrease the value by one
		
		//1.Post Increment
		int a=1;
		int b=a++;//increase the value of a later
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int g=-98;
		int h=g++;
		
		
		//Pre increment
		
		int c=1;
		int d=++c;
		
		System.out.println(c); //2
		System.out.println(d);//2
		
		int t=-99;
		int p=++t;
		
		System.out.println(t);//-98
		System.out.println(p);//-98
		
		
		//Post decrement
		int k=2;
		int m=k--;
		
		System.out.println(k);//1
		System.out.println(m);//2
		
		//pre decrement
		int e=2;
		int f=--e;
		
		System.out.println(e);//1
		System.out.println(f);//1
		
		int u=2;
		System.out.println(u++);//2//Here the original value of u will be assigned to 
		//..to println i.e 2
		System.out.println(u++);//3//next line the value of 2 will be increased to 3
		
		int z=3;
		System.out.println(z++);
		System.out.println(z);
		
		int y=4;
		System.out.println(++y);//5
		
		
		
	}

}
