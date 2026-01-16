package hasARelationship;

public class CarMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CarMulObjRef c = new CarMulObjRef();
		 for(int i=0;i<c.getCarTyre().length;i++) {
			 System.out.println(c.getCarTyre()[i].getTyre());
		 }
	}
}
