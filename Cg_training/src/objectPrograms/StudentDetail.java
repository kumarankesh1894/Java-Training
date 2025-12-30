package objectPrograms;

public class StudentDetail {
	String pan;	
	String aadhar;	
	String voterCard;
	/*
	 * Constructor Overloading
	  */
	StudentDetail(){
		
	}
	StudentDetail(String pan){
		this.pan = pan;
	}
	StudentDetail(String pan, String aadhar){
		this.pan=pan;
		this.aadhar = aadhar;
	}
	StudentDetail(String pan, String aadhar, String voterCard){
		this.pan=pan;
		this.aadhar = aadhar;
		this.voterCard = voterCard;
	}
}
