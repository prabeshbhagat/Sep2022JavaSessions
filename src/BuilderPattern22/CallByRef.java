package BuilderPattern22;

public class CallByRef {

	String name;

	public void info(CallByRef c1) {
		c1.name = "Deepak";
	}

	public static void main(String[] args) {
		CallByRef c1 = new CallByRef();
		c1.name = "Rinku";
		System.out.println(c1.name);
		c1.info(c1);
		System.out.println(c1.name);
	}

}
