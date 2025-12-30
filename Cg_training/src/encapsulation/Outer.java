package encapsulation;

public class Outer {
	static class Inner{
		static void display() {
			System.out.println("Static Method");
		}
		void testDisplay() {
			System.out.println("This is non Static Method");
		}
	}
	class Inner2{
		static void display() {
			System.out.println("Static Method");
		}
		void testDisplay() {
			System.out.println("This is non Static Method");
		}
	}
}
