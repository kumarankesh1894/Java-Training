package encapsulation;

public class OuterPrivateInner {
	private class Inner {
		public static void display() {
			System.out.println("This is Private Inner Method Call.");
		}
	}
	public void innerTest() {
		Inner in = new Inner();
		in.display();
	}
}
