package objectPrograms;

public class CollegeDb {
		String name;
		int regNo;
		String university = "LPU";
		boolean isActive;
		
		public CollegeDb(){
		}
		public CollegeDb(String name) {
			this();
			this.name = name;
		}
		public CollegeDb(String name,int regNo) {
			this(name);
			this.regNo = regNo;
		}
		public CollegeDb(String name,int regNo,boolean isActive) {
			this(name,regNo);
			this.isActive = isActive;
		}
		public void getData() {
			System.out.println("University Name: "+university);
			System.out.println("Student Name: "+name);
			System.out.println("Registration Number: "+regNo);
			System.out.println("Is Account Active: "+isActive);
		}
}
