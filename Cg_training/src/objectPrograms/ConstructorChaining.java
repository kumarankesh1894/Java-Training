package objectPrograms;

public class ConstructorChaining {
	String pan;	
	String aadhar;	
	String voterCard;
	/*
	 * Constructor Chaining
	  */
	ConstructorChaining(){
		
	}
	ConstructorChaining(String pan){
		this.pan = pan;
	}
	ConstructorChaining(String pan, String aadhar){
		this(pan);
		this.aadhar = aadhar;
	}
	ConstructorChaining(String pan, String aadhar, String voterCard){
		this(pan,aadhar);
		this.voterCard = voterCard;
	}
}
