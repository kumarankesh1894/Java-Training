package objectPrograms;

public class CollegeDbApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CollegeDb stu1 = new CollegeDb();
			CollegeDb stu2 = new CollegeDb("Ankesh");
			CollegeDb stu3 = new CollegeDb("Saurabh",12213989);
			CollegeDb stu4 = new CollegeDb("Sampy",12213455,true);
			stu1.getData();
			System.out.println();
			stu2.getData();
			System.out.println();
			stu3.getData();
			System.out.println();
			stu4.getData();
	}

}
