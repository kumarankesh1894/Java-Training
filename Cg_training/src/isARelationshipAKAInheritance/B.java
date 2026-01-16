package isARelationshipAKAInheritance;

public class B extends A {
	//non static method to perform task on the non static variable.
	public void display() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//directly access the static variable.
		System.out.println(a);
		m1();
		//creating object to access the non-static variable.
		B b = new B();
		//calling the non static method using the object.
		b.display();
	}

}