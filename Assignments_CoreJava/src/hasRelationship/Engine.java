package hasRelationship;

public class Engine {
		private String engineType;
		private int horsePower;
		
		Engine(){
			
		}
		Engine(String engineType,int horsePower){
			this.engineType = engineType;
			this.horsePower = horsePower;
		}
		public void setEngineType(String engineTypes) {
			this.engineType = engineTypes;
		}
		public void getEngineType() {
			System.out.println("The Engine Type: "+engineType);
		}
		public void setHorsePower(int horsePowers) {
			this.horsePower = horsePowers;
		}
		public void getHorsePower() {
			System.out.println("Horse Power of Engine: "+horsePower);
		}
}
