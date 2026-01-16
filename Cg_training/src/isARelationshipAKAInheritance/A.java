package isARelationshipAKAInheritance;

public class A {
	//static variable: access directly in another 
	static int a=10;
	//non static variable: access by creating the object
	int b=100;
	
	//static method
	public static void m1() {
		System.out.println("Parent");
	}
	
}
