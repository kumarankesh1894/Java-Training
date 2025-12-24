package DynamicControlStatements;
import java.util.Scanner;
public class DaysinMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Month: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		switch(str) {
		case "january": System.out.println("The number of Days in "+str+" is 31."); break;
		case "feburary": System.out.println("The number of Days in "+str+" is 28 and 29 days if the year is leap year."); break;
		case "march": System.out.println("The number of Days in "+str+" is 31."); break;
		case "april": System.out.println("The number of Days in "+str+" is 30."); break;
		case "may": System.out.println("The number of Days in "+str+" is 31."); break;
		case "june": System.out.println("The number of Days in "+str+" is 30."); break;
		case "july": System.out.println("The number of Days in "+str+" is 31."); break;
		case "august": System.out.println("The number of Days in "+str+" is 31."); break;
		case "september": System.out.println("The number of Days in "+str+" is 30."); break;
		case "october": System.out.println("The number of Days in "+str+" is 31."); break;
		case "november": System.out.println("The number of Days in "+str+" is 30."); break;
		case "december": System.out.println("The number of Days in "+str+" is 31."); break;
		default: System.out.println("Please Enter Correct Input.");
		
		}
		
		sc.close();
	}

}
