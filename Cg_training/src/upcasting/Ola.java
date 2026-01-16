package upcasting;
import java.util.*;
public class Ola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice\n1: Mini\n2: Sedan\n3: Luxury:");
		int choice = sc.nextInt();
		System.out.println(choice);
		
		//Creating a variable of parent type
		Cab c = null;
		
		switch(choice) {
		case 1: c = new Mini();
					break;
		case 2: c=new Sedan();
		break;
		case 3: c=new Luxury();
		break;
		default: System.out.println("Invalid Input");
		}
		
		System.out.println("The Object Created: "+c);
		sc.close();
		
	}

}
