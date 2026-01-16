package hierarchialInheritance;

public class Square extends Shape{
			double side;
			Square(){
				
			}
			Square(double side){
				this.side = side;
				area = side*side;
			}
			public double displaySquare() {
				area = side*side;
				return area;
			}
}
