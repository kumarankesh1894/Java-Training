package hasRelationship;

public class Page {
	
		private int pageNo;
		public void setPageNo(int pageNo) {
			this.pageNo = pageNo;
		}
		public int getPageNo() {
			return pageNo;
		}
		Page(){
		}
		Page(int pageNo){
			this.pageNo = pageNo;
		}
}