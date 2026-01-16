package hierarchialInheritance;

public class Circle extends Shape{
	
	double radius;
	Circle(){
	}
	Circle(double radius){
		this.radius =radius;
		area = radius*radius*3.14;
	}
	public double displayCicle() {
		area = 3.14*radius*radius;
		return area;
	}

}
