package encapsulation;

public class MultiObjReferenceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiObjReference mul1 = new MultiObjReference("Kutta");                                                    
		System.out.println(mul1.name);
		MultiObjReference mul2 = mul1;
		System.out.println(mul2.name);
		mul2.name = "Billi";
		System.out.println(mul1.name);
		System.out.println(mul2.name);
	}

}
