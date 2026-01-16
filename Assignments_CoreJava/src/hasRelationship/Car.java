package hasRelationship;

public class Car {
		
	private String carBrand,carModel;
	Car(){}
	
	Car(String carBrand,String carModel){
		this.carBrand = carBrand;
		this.carModel = carModel;
	}
	public void setCarBrand(String carBrands) {
		this.carBrand = carBrands;
	}
	public void getBrand() {
		System.out.println("Brand Name: "+carBrand);
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public void getModel() {
		System.out.println("Model name: "+carModel);
	}
	
	private Engine e;
	public void setEngine(Engine e) {
			this.e = e;
	}
	public Engine getEngine() {
		return e;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("Ford","Mustang");
		Engine eng = new Engine("Mustang123",5000);
		c.setEngine(eng);
		c.getEngine().getHorsePower();
		c.getEngine().getEngineType();
		c.setEngine(new Engine("Ford123",4000));
		c.getEngine().getHorsePower();
		c.getBrand();
		c.getModel();
	}

}
