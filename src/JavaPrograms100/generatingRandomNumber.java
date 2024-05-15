package JavaPrograms100;

//generating four digits random  number
public class generatingRandomNumber {
	
	public static void randomNum() {
		double ranNum=Math.random();
		int intranNum=(int) (ranNum*10000);
		String stringRanNum=String.valueOf(intranNum);
		int sizeNum=stringRanNum.length();
		
		if(sizeNum==4) {
			System.out.println(stringRanNum);
		}else {
			randomNum();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomNum();
	}

}
