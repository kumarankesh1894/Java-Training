package hasARelationship;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("BMW");
		c.getModelName();
		System.out.println(" "+c.getEngine().getHp());
	}

}
