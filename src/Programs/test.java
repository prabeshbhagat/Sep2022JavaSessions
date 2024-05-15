package Programs;

public class test {
	
	public String empid="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t= new test();
		t.m1("123");
		
	}
	
	public void m1(String employee_id) {
		empid=employee_id;
		System.out.println(empid);
	}

}
