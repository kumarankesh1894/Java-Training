package hasARelationship;

public class Car {
	String modelName;


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void getModelName() {
		System.out.print(modelName);
	}
	Car(){
		
	}
	Car(String modelName){
		this.modelName = modelName;
	}
//	Engine e = new Engine(1000);
	
	//for private object we have to make a public method and then call that function instead of object name in the main class;
	private Engine e = new Engine(1000);
	public Engine getEngine() {
		return e;
	}
	
}
