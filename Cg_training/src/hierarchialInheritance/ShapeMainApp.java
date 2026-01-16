package hierarchialInheritance;

public class ShapeMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Triangle t = new Triangle(12,10);
			Circle c = new Circle(3);
			Square sq = new Square(4);
			System.out.println(t.displayTriangle());
			System.out.println(c.displayCicle());
			System.out.println(sq.displaySquare());
		
	}

}
