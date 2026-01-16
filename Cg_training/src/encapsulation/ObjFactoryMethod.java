package encapsulation;

public class ObjFactoryMethod {
	double len;
	ObjFactoryMethod(){
		
	}
	ObjFactoryMethod(double len){
		this.len = len;
	}
	public static ObjFactoryMethod createObj() {
		return new ObjFactoryMethod();
	}
	public static ObjFactoryMethod createObj(double len) {
		return new ObjFactoryMethod(len);
	}
}
