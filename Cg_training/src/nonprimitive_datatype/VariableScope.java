package nonprimitive_datatype;

public class VariableScope {
	//block b1
	public static void main(String[]args) {
		int a = 5;
		System.out.println(a);
		//block b2
		{
			int b = 10;
			System.out.println(b);
			System.out.println(a);
		}
		//block b3
		{
			a = 10;
			System.out.println(a);
		}
		System.out.println('A'+'B');
	}
}
