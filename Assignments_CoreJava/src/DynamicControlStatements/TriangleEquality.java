package DynamicControlStatements;
import java.util.Scanner;
public class TriangleEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side1: ");
		double side1 = sc.nextDouble();
		System.out.println("Enter Side2: ");
		double side2 = sc.nextDouble();
		System.out.println("Enter Side3: ");
		double side3 = sc.nextDouble();
		if(side1==side2 && side2==side3) System.out.println("The Triangle is Equilateral Triangle.");
		else if(side1==side2 && side2!=side3) System.out.println("The Triangle is Isoceles Triangle.");
		else System.out.println("The Triangle is Scalene Triangle.");
		
	}

}
