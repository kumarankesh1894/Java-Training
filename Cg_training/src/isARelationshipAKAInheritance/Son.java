package isARelationshipAKAInheritance;

public class Son extends Father{
		String name = "Ankesh";
		public void display() {
			System.out.println("Father Name: "+super.name);
			System.out.println("Son Name: "+name);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		s1.display();
		
	}

}
