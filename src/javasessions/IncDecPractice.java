package javasessions;
//https://javaconceptoftheday.com/quiz-on-increment-and-decrement-operators/

public class IncDecPractice {

	public static void main(String[] args) {
		
		//type 1

        int i = 11;
         
        i = i++ + ++i;
         
        System.out.println(i);//24
    
//       i=11,
//       i = i++ + ++i
//       i = (i is used before increment) + (i is used after increment)
//       i = 11(i=12) + 13(i=13)
//       i = 11 + 13 = 24
        
        //Type 2
        
        int a=11, b=22, c;
        
        c = a + b + a++ + b++ + ++a + ++b;
         
        System.out.println("a="+a);//13
        System.out.println("b="+b);//24
        System.out.println("c="+c);//103
        
        
        //Type 3
        

        int q=0;
         
        q = q++ - --q + ++q - q--;
         
        System.out.println(q);       
        
        //Type 4
        
        //boolean b = true;
//        b++;
        System.out.println(b);
        //++ or -- cannot be applied to boolean types
        
        
        
        //Type 4
        

        int i1=1, j=2, k=3;
         
        int m = i1-- - j-- - k--;
         
        System.out.println("i1="+i1);
        System.out.println("j="+j);
        System.out.println("k="+k);
        System.out.println("m="+m);
        
        //Type 5
        
        int a1=1, b1=2;
        
        System.out.println(--b1 - ++a1 + ++b1 - --a1);
        
        
        //Type 6
        
        int a2=1, b2=2;
        
        System.out.println(--b2 - ++a2 + ++b2 - --a2);
        //Answer : 0
        
        //Type 7
        
        int p=19, n=29, o;
        
        o = p-- - p++ + --n - ++n + --p - n-- + ++p - n++;
         
        System.out.println("p="+p);
        System.out.println("n="+n);
        System.out.println("o="+o);
        
        
        //Type 8
        
        //int i = 11;
        //int j = --(i++);
        //Answer : Because, ++ or — can’t be nested [ –(i++) ].
        
        
        //Type 9
        
        int m1 = 0, n1 = 0;     
        int p1 = --m1 * --n1 * n1-- * m1--;       
        System.out.println(p1);//1
        System.out.println(n1);//-2
        System.out.println(m1);//-2
        
        
        
        //type 10
        
        int a9=1;
        a9 = a9++ + ++a9 * --a9 - a9--;
        System.out.println(a9);//5
        
        //type 11
        
        //int a8 = 11++;
        //System.out.println(a8);
        //Answer : Compile time error : ++ or — can’t be applied to constants.
        
        
        
        //type 12
        int m5=1010, n5=1010;
        System.out.println(m5++ / ++n5 * n5-- / --m5);//0
        
        //type 13
        
        int x6 = 001, y6=010, z6=100;
        
        int i6 = --x6 + y6++ - z6-- - --z6 + ++y6 - --x6 + y6-- - --x6;
         
        System.out.println("x="+x6);
        System.out.println("y="+y6);
        System.out.println("z="+z6);
        System.out.println("i="+i6);
        
        
        //type 14
        
        int ch = 'A';
        System.out.println(ch);
        System.out.println(ch++);//65
        
        
        //type 15
        
        char ch1 = 'A';
        System.out.println(ch1++);//A
        System.out.println(++ch1);//C
        
        
        //type 16
        
        char ch2 = "123".charAt(1);
        
        System.out.println(ch2);
        System.out.println("-----");
        System.out.println(ch2++ + ++ch2);//2+4//50+52//102
        //asci value of 2 is 50 
        
        
        int c6='2';
        System.out.println(c6);//50
        
        //type 17
        
        char ch5 = '0';
        System.out.println(ch5-- + --ch5);
        
        
        
        
	}

}
