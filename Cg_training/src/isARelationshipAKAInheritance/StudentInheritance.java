package isARelationshipAKAInheritance;

public class StudentInheritance extends PersonInheritance {
		int id;
		 StudentInheritance() {
			
		}
		 StudentInheritance(String name, int id) {
			 super(name);
			 this.id = id;
		 }
		 
		 
}
