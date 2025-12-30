package objectPrograms;

public class StudentDetailsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetail s1 = new StudentDetail();
		StudentDetail s2 = new StudentDetail("EQTPA2018H");
		StudentDetail s3 = new StudentDetail("Eqtpa2018U","896530630151");
		StudentDetail s4 = new StudentDetail("EQTPA2018R","896530630141","XX837921");
		
		System.out.println(s1.pan);
		System.out.println(s2.pan);
		System.out.println(s3.pan+" "+s3.aadhar);
		System.out.println(s4.pan+" "+s4.aadhar+" "+s4.voterCard);
		
	}

}
