package hierarchialInheritance;

public class Triangle extends Shape{
		double base,height;
		
		Triangle(){
			
		}
		Triangle(double base,double height){
				this.base = base;
				this.height = height;
				
		}
		public double displayTriangle() {
			area = base*height*0.5;
			return area;
		}
}
