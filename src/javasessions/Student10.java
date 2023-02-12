package javasessions;

public class Student10 {

	// Acceptance criteria
	// WAF:
	// pass the student name String
	// return Student marks:int

	// er- This method must return a result of type int
	// when return with else statement is not present it will give above error

	public int getStudentMarks(String studentName) {

		System.out.println("Getting marks of students...." + studentName);

		if (studentName.equals("Surya")) {
			return 90;
		} else if (studentName.equals("Sameer")) {
			return 95;
		} else if (studentName.equals("Ramesh")) {
			return 100;
		} else {
			System.out.println("Student not found in system" + studentName);
			return -1;
		}
	}

	public int getMarks(String studentNames) {
		int marks = -1;
		System.out.println("Getting marks of Class students using single return...." + studentNames);

		if (studentNames.equals("Surya")) {
			// return 90;
			marks = 90;

		} else if (studentNames.equals("Sameer")) {
			// return 95;
			marks = 95;
		} else if (studentNames.equals("Ramesh")) {
			// return 100;
			marks = 100;
		} else {
			System.out.println("Student not found in system" + studentNames);
		}

		return marks;

	}

	// Assignment above example with switch case
	public int getMarksWithSwitch(String scholarName) {

		System.out.println("Printing switch case statements");

		int m3 = -1;
		switch (scholarName) {
		case "Dinesh":
			m3 = 100;
			break;

		case "Shami":
			m3 = 95;
			break;

		case "Chahal":
			m3 = 90;
			break;

		default:
			System.out.println("Student name not found in system");
			break;
		}

		return m3;
	}

	// main method does not return anything
	// internally it is called by JVM
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student10 st = new Student10();
		int marks = st.getStudentMarks("Surya");
		System.out.println(marks - 5);

		int m1 = st.getStudentMarks("Naveen");
		System.out.println(m1);
		if (m1 == -1) {
			System.out.println("Do Not print the marksheet");
		}

		System.out.println("--------------------------------");

		int m2 = st.getMarks("Surya");
		System.out.println(m2 - 5);

		int m3 = st.getMarks("Naveen");
		System.out.println(m3);
		if (m3 == -1) {
			System.out.println("Do Not print the marksheet");
		}

		int m4 = st.getMarksWithSwitch("Ashwin");
		System.out.println(m4);
	}

}
