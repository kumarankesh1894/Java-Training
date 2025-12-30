package encapsulation;

public class OuterInnerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Outer.Inner.display();
			Outer.Inner obj = new Outer.Inner();
			obj.testDisplay();
			
			System.out.println("\nExecuting Non Static Inner Class ");
			Outer out = new Outer();
			Outer.Inner2 inner = out.new Inner2();
			inner.testDisplay();
			inner.display();
	}

}
