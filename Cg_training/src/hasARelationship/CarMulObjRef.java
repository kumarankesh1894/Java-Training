package hasARelationship;

public class CarMulObjRef {
/*
	Tyre []tyres = {
				new Tyre("Mrf"),
				new Tyre("Mrf"),
				new Tyre("Mrf"),
				new Tyre("Mrf")
		};
		
		if the array is public then we can directly use it to get the data.
		
		*/
	
	//If The tyre obj is private type then we will make getter and setter method to set and fetch the data from tyre type array.
	
	//Array declaration and initialization.
	private Tyre [] tyres = {
			new Tyre("Mrf"),
			new Tyre("Mrf"),
			new Tyre("Mrf"),
			new Tyre("Mrf")
	};
	//getter and setter method
	public void setCarTyre(Tyre[] tyres) {
		this.tyres = tyres;
	}
	public Tyre [] getCarTyre() {
		return tyres;
	}
	
		
}
