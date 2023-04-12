package oops_Interface17_18;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh= new FortisHospital();
		fh.cardioServices();
		fh.neuroServices();
		
		fh.ENTServices();
		fh.pediaServices();
		fh.orthoServices();
		
		fh.physioServices();
		fh.DentalServices();
		
		fh.medicalTraining();
		fh.TrainingBills();
		
		fh.emergencyServices();
		fh.medicalNews();
		fh.covidVacination();
		fh.releseFunds();
		
		System.out.println("-----------------------");
		//Cannot make a static reference to the non-static field FortisHospital.bill_amount
		//System.out.println(FortisHospital.bill_amount);
		
		System.out.println(USMedical.bill_amount);
		//The static field USMedical.bill_amount should be accessed in a static way
		USMedical.USMedicalHistory();
		//System.out.println(FortisHospital.bill_amount);
		FortisHospital.USMedicalHistory();
		System.out.println(fh.bill_amount);
		
		//Top Casting
		//child class object refferred by parent interface ref variable
		IndianMedical im=new FortisHospital();
		im.DentalServices();
		im.orthoServices();
		im.emergencyServices();
		
		
		UKmedical uk=new FortisHospital();
		uk.pediaServices();
		uk.ENTServices();
		uk.emergencyServices();
		
		//Top Casting
		//child class object referred by grand parent interface ref variable
		WHO who=new FortisHospital();
		who.covidVacination();

	}

}
