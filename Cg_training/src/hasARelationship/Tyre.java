package hasARelationship;

public class Tyre {
	private String brand;
	public void setTyre(String brand) {
		this.brand = brand;
	}
	public String getTyre() {
		return brand;
	}
	
	Tyre(){
		
	}
	Tyre(String brand){
		this.brand = brand;
	}
}
