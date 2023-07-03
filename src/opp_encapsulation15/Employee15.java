package opp_encapsulation15;

public class Employee15 {

	private String name;
	private int age;
	private double sal;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public static void main(String[] args) {
		Employee15 e1 = new Employee15();
		e1.age = 20;
		System.out.println(e1.age);
		Browser15 b1 = new Browser15();
		b1.launchBrowser();
	}

}
