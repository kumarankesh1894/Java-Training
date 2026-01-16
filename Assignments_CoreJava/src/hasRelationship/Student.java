package hasRelationship;

public class Student {
		
	StudentAddress st = new StudentAddress("Gaya","Bihar",823001);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student Address: "); 
		Student stu = new Student();
		System.out.println(stu.st.getCity());
		System.out.println(stu.st.getState());
		System.out.println(stu.st.getPinCode());
	}

}
