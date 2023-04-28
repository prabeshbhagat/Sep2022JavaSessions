package JavaQuestiones;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader= new Scanner(System.in);
		System.out.println("Please neter your number:");
		int num=reader.nextInt();
		if(num%2==0) {
			System.out.println("It is a even number:"+num);
		}else {
			System.out.println("It is a odd number:"+num);
		}

	}

}
