package Encapsulation;

public class StudentMarks {
		private double marks;
		
		StudentMarks(double marks){
			this.marks = marks;
		}
		public void setMarks(double marks) {
			if(marks<=100) {
			this.marks = marks;
			}else {
				System.out.println("Please Enter the marks below 100.");
			}
		}
		public void getMarks() {
			System.out.print("Student Marks: "+marks);
		}
		
		public static void main(String[] args) {
			StudentMarks student = new StudentMarks(100);
			student.setMarks(90);
			student.getMarks();
			
		}
		
}
