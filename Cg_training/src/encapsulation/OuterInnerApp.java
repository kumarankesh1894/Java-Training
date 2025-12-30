package encapsulation;

public class OuterInnerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Outer.Inner.display();
			Outer.Inner obj = new Outer.Inner();
			obj.testDisplay();
			
			Outer out = new Outer();
			Outer.Inner2 inner = out.new Inner2();
			inner.testDisplay();
	}

}
