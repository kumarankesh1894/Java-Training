package hasRelationship;

public class Department {
		private int block;
		private String depatmentName;
		
		public void setDepartment(int block, String departmentName) {
			this.block = block;
			this.depatmentName = departmentName;
		}
		public String getDepartment() {
			return depatmentName;
		}
		public void setBlock(int block) {
			this.block = block;
		}
		public int getBlock() {
			return block;
		}
		Department(){
			
		}
		Department(int block,String departmentName){
			this.block = block;
			this.depatmentName = departmentName;
		}
}
