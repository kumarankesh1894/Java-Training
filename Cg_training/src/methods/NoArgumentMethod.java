package methods;

public class NoArgumentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			RectArea();
			CircleArea();
			SquareArea();
			TriangleArea();
			
	}
	public static void RectArea() {
		int length = 10;
		int breadth = 50;
		System.out.println("Area of Rectangle: "+length*breadth);
	}
	public static void CircleArea() {
		int radius = 4;
		double area = 3.14*radius*radius;
		System.out.println("Area of Circle: "+area);
	}
	public static void SquareArea() {
		int side = 5;
		System.out.println("Area of Square: "+side*side);
	}
	public static void TriangleArea() {
		int base = 20;
		int height = 100;
		double area = 0.5*base*height;
		System.out.println("Area of Triangle: "+area);
	}
	
	
	
}
