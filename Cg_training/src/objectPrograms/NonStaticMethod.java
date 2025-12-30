package objectPrograms;

public class NonStaticMethod {
		double len;
		double bread;
		
		public NonStaticMethod(double len, double bread) {
			this.len=len;
			this.bread = bread;
		}
		public double calcArea() {
			return len*bread;
		}
}
