package hasRelationship;

public class Sim {
		private boolean network;
		private String number;
		public Sim(boolean network,String number) {
			this.network = network;
			this.number = number;
		}
		
		public boolean isNetwork() {
			return network;
		}
		public void setNetwork(boolean network) {
			this.network = network;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		
		
}
