


/*Distance between to points
 * 
 */

import java.util.Scanner;

public class DistanceCalculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		
		//Variables
		double X1, X2, X3, X4, Y1, Y2, Y3, Y4, distance;
		
		//Ask user for input
		System.out.print("Enter X1: ");
		X1 = scan.nextDouble();
		System.out.print("Enter Y1: ");
		Y1 = scan.nextDouble();
		System.out.print("Enter X2: ");
		X2 = scan.nextDouble();
		System.out.print("Enter Y2: ");
		Y2 = scan.nextDouble();
		
		//distance formula broken into parts
		X3 = X2 - X1;
		Y3 = Y2 - Y1;
		X4 = Math.pow(X3, 2);
		Y4 = Math.pow(Y3, 2);
		
		distance = Math.sqrt(X4 + Y4);
		
		//print distance between points
		System.out.println("Distance: " + distance);
	}

}