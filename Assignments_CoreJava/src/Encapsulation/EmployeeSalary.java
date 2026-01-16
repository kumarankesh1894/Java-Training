
package Encapsulation;

public class EmployeeSalary {
		private double salary;
		EmployeeSalary(){
			
		}
	 EmployeeSalary(double salary) {
//		 if(salary>0) {
//		 	this.salary = salary;
//		 }
		 setSalary(salary);
	}
	 public void setSalary(double salary) {
		 if(salary<0) {
			 System.out.println("Salary Should be positive.");
		 }
		 else {
			 this.salary = salary;
		 }
	 }
	 public void getSalary() {
		 System.out.println("The Salary of employee: "+salary);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalary emp = new EmployeeSalary();
		emp.setSalary(60000);
		emp.getSalary();

	}

}
