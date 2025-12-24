package Operators;

public class divisibility3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number = 104;
		/*
		 *Check if divisible by 3 and 5*/
			
			boolean res = ((number%3==0 && number%5==0)) || ((number%3!=0 && number%5==0) ||(number%3==0 && number%5!=0)|| (number%3!=0 && number%5!=0)
			System.out.println("Is "+number+ " Divisible by 3 and 5: "+res);
	}

}
