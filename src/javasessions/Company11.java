package javasessions;

import java.util.Arrays;

public class Company11 {

	// AC
	// WAF
	// GEt Employee devicess store in array max 5 values
	// input params: Emp Name
	// return String [],all the devices --Array

	String dList[];

	public String[] getEmpDlist(String empName) {

		if (empName.equals("sameer")) {
			dList = new String[] { "iPhone", "SWatch", "Earphones" };
			System.out.println("The length is :" + dList.length);
		} else if (empName.equals("abse")) {
			dList = new String[] { "Samsung", "Watch" };
			System.out.println("The length is :" + dList.length);
		} else if (empName.equals("abdul")) {
			dList = new String[] { "Ft watch", "bike", "car", "bullet", "shoes" };
			System.out.println("The length is :" + dList.length);
		} else {
			System.out.println("The mep is not found in system");
		}

		return dList;

	}

	public String[] getEmployeeDeviceList(String empName) {

		String devices[] = new String[5];

		System.out.println("Getting employee devices name." + empName);
		if (empName.equals("sritam")) {
			devices[0] = "iPhone14";
			devices[1] = "mouse";
			devices[2] = "keyboard";
			devices[3] = "iPad";
			devices[4] = "headphones";

		} else if (empName.equals("anu")) {
			devices[0] = "Nokia";
			devices[1] = "Wireless mouse";
			devices[2] = "Wireless keyboard";

		} else if (empName.equals("smruti")) {
			devices[0] = "Samsung";
			devices[1] = "Wireless bag";
			devices[2] = "GPS device";

		}

		else {
			System.out.println("Emp name not found ");

		}

		return devices;// returning variable name

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company11 co = new Company11();
		String s1[] = co.getEmployeeDeviceList("anu");
		System.out.println(s1.length);
		System.out.println(Arrays.toString(s1));
		
		
		String[] dev=co.getEmpDlist("sameer");
		System.out.println(Arrays.toString(dev));
	
		

	}

}
