package DecisionMakingStatements;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Switch(value/variable/expression){
		 * 		case value/expression: sopln("") 
		 * 		case value/expression: sopln("")
		 * 		case value/expression: sopln("")
		 * }
		 * without break keyword the control will execute all the cases from where the switch expression satisfied.
		 * with break statement it will move to that case and come out of the switch statement;
		 * */
		
		int number = 2;
		switch(number){
		case 1: System.out.println("Hii"); break;
		case 2: System.out.println("Hello"); break;
		case 3:System.out.println("Bye"); break;
		default: System.out.println("Hatt");
		}
		
	}

}
