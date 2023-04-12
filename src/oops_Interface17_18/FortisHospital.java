package oops_Interface17_18;

//IS-A_relationship
public class FortisHospital extends Medical implements USMedical, UKmedical, IndianMedical {

	int bill_amount = 100;

	// US
	@Override
	public void physioServices() {
		System.out.println("---USMedical--physioServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("---USMedical--cardioServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("---USMedical--neuroServices");

	}
	
	
	@Override
	public void physioServices(int a) {
		System.out.println("---USMedical--physioServices-Overload-1");
		
	}

	@Override
	public int physioServices(int a, int b) {
		System.out.println("---USMedical--physioServices-Overload-2");
		return 0;
	}

	// Indian Medical
	@Override
	public void orthoServices() {
		System.out.println("---Indian Medical--orthoServices");

	}

	@Override
	public void DentalServices() {
		System.out.println("---Indian Medical--DentalServices");

	}

	// UK Medical
	@Override
	public void ENTServices() {
		System.out.println("---UKMedical--ENTServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("---UKMedical--pediaServices");

	}

	// Common

	// Individual
	public void medicalTraining() {
		System.out.println("-FH--medicalTraining");
	}

	public void TrainingBills() {
		System.out.println("-FH--TrainingBills");
	}

	@Override
	public void emergencyServices() {
		System.out.println("-FH--emergencyServices");

	}

	@Override
	public void covidVacination() {
		System.out.println("-FH--covidVacination");

	}

	@Override
	public void releseFunds() {
		System.out.println("-FH--releseFunds");

	}
	
	//Method Hiding 
	public static void USMedicalHistory() {
		System.out.println("--FH--USMedicalHistory");
	}
	
	//default method can be overiden with public method
	@Override
	public  void medicalRD() {
		System.out.println("--USMedical--medicalRD");
	}

	

}
