package objectPrograms;

public class ConstructorChainingApp {

	public static void main(String[] args) {
		ConstructorChaining s1 = new ConstructorChaining();
		ConstructorChaining s2 = new ConstructorChaining("EQTPA2018H");
		ConstructorChaining s3 = new ConstructorChaining("Eqtpa2018U","896530630151");
		ConstructorChaining s4 = new ConstructorChaining("EQTPA2018R","896530630141","XX837921");
		
		System.out.println(s1.pan);
		System.out.println(s2.pan);
		System.out.println(s3.pan+" "+s3.aadhar);
		System.out.println(s4.pan+" "+s4.aadhar+" "+s4.voterCard);
		
	}

}
