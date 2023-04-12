package oops_Interface17_18;

public interface USMedical extends WHO,UNHG {
	
	
	//Abstract methods do not specify a body
//	public void physioServices() {
//		
//	}
	
	//methods with no body--Method declartion
	//Method prototype
	//Abstract methods
	
	
	
	int bill_amount=10;
	
	public void physioServices();
	public void physioServices(int a);
	public int physioServices(int a,int b);
	public void cardioServices();
	public void neuroServices();
	public void emergencyServices();
	
	//JDK 1.8
	//1. Can have static method in interface with method body
	
	public static void USMedicalHistory() {
		System.out.println("--USMedical--USMedicalHistory");
	}
	
	//2,Default method can have method body
	default void medicalRD() {
		System.out.println("--USMedical--medicalRD");
	}
	


}
