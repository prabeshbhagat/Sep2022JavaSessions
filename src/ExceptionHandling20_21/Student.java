package ExceptionHandling20_21;

public class Student {

	public static int getStudentMarks(String name) {

		System.out.println("Student Name is :" + name);

		if (name.equals("aman")) {
			try {
				int a = 9 / 3;
				return 65;
			} catch (ArithmeticException e) {
				System.out.println("Inside catch");
				return 75;
			}finally {
				System.out.println("Inside finally");
				return 90;
			}

		} else if (name.equals("swati")) {
			return 95;
		} else if (name.equals("Karan")) {
			return 90;
		} else {
			System.out.println("name not found");
			return -1;
		}

	}

	public static void main(String[] args) {
		int m1 = getStudentMarks("aman");
		System.out.println(m1);
	}

}
