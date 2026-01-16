package hasRelationship;

public class University {
		private String uniName, address;
		
		
		public void setuniName(String uniName) {
			this.uniName = uniName;
		}
		public String getUniName() {
			return this.uniName;
		}
		
		public void setUniAddress(String address) {
			this.address = address;
		}
		public String getUniAddress() {
			return this.address;
		}
		
		
		University(){
			
		}
		University(String uniName,String address){
			this.uniName = uniName;
			this.address = address;
		}
		public University getUni() {
			return this;
		}
		Department d = new Department(34,"Computer Science and Engineering");
		
		
}
