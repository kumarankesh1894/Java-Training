package hasRelationship;

public class Mobile {
		private Sim sim1 ;
		Mobile(){
			this.sim1 = new Sim(true,"9304580938"); //composition
		}
		
		public void makeCall() {
			if(sim1.isNetwork()) {
				System.out.println("Calling from: "+sim1.getNumber());
			}else {
				System.out.println("Network Not Available.");
			}
		}
		
	public static void main(String[] args) {
		Mobile mob1 = new Mobile();
		mob1.makeCall();
	}

}
