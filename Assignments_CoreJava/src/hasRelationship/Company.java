package hasRelationship;

public class Company {
		private CompanyEmployee emp;
		
		
		
		//Lazy instantiation
		public CompanyEmployee getEmployee() {
			if(emp==null) {
				emp = new CompanyEmployee(12213063, "Ankesh", 150000);
			}
			return emp;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company cmp = new Company();
		System.out.println("Company Employee Details: ");
		
		System.out.println(cmp.getEmployee().getId());
		System.out.println(cmp.getEmployee().getName());
		System.out.println(cmp.getEmployee().getSalary());
	}

}
