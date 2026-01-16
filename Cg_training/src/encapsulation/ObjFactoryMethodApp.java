package encapsulation;

public class ObjFactoryMethodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjFactoryMethod obj1 = ObjFactoryMethod.createObj();
		System.out.println(obj1.len);
		ObjFactoryMethod obj2 = ObjFactoryMethod.createObj(5);
		System.out.println(obj2.len);
		
	}

}
