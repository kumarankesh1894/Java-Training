package objectClass;

public class Phone {
	private String brand;
		InternalPartsOfPhone [] itp;
		Phone(String brand) {
			this.brand = brand;
		}
		
		public void setPhoneBrand(String brand) {
			this.brand = brand;
		}
		int i=0;
		public void setPhoneDetails(InternalPartsOfPhone phoneDetail) {
			if(itp==null) {
				itp=new InternalPartsOfPhone[4];
			}
			if(itp[i]==null) {
			this.itp[i] = phoneDetail;
			}
			i++;
		}
		
		public InternalPartsOfPhone [] getPhoneDetails() {
			return itp;
		}
		
		public String toString() {
			StringBuilder str = new StringBuilder();
			str.append("Brand Name: ").append(brand).append("\n");
			for(InternalPartsOfPhone i: itp) {
				if(i!=null) {
				str.append("Ram: ").append(i.getRam()).append("   ROM: ").append(i.getRom());
				}
			}
			return str.toString();
		}
}
