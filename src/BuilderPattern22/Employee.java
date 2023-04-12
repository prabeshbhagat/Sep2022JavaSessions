package BuilderPattern22;

public class Employee extends Company{

	int empId;
	String name;
	int age;

	public Employee() {
		System.out.println("Employee const------");
	}

	public Employee(int empId, String name, int age) {
		super(name, age);
		this.empId = empId;
		this.name = name;
		this.age = age;
		
		System.out.println("Employee 3 param const------");
	}

	public static void main(String[] args) {
		Employee e= new Employee(12345,"Abhinash",25);
		System.out.println(e.empId+" "+e.name+" "+e.age);
	}

}
