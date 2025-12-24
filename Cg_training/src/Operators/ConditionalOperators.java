package Operators;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Conditional Operators
//		Condition ? Val1/ variable expression: Val2/variable expression
//		if condition true: val1 else val2
//	1)
		int a = 10,b=50;
		int res = a>b ? a:b;
		System.out.println(res);
		
		
//	2)	
		int age1 = 18, age2 = 40;
		String res1 = age1 > age2 ? "Son" : "Father";
		System.out.println(res1);
		
	}

}
