package array;
import java.util.Scanner;
public class Dynamic2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Rows: ");
		int row = sc.nextInt();
		System.out.print("Enter no of columns: ");
		int col=sc.nextInt();

		int [][]arr = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("Enter "+(j+1)+" Value: ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
