package hasRelationship;

public class UniversityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University uni = new University("LPU","Phagwara");
		System.out.println(uni.d.getDepartment());
		System.out.println(uni.d.getBlock());
		System.out.println(uni.getUniAddress());
		System.out.println(uni.getUniName());
	}

}
