


/*This program calculates the sum of number entered.
 */

 import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		
		//Variables
		int remainder, number, sum = 0;
		
		//Asks user for input
		System.out.print("Enter number: ");
		number = scan.nextInt();
		
		//while loop runs until number < 1 
		while(number > 0) 
		{
		//Equation
		remainder = number % 10;
		sum = sum + remainder;
		number = number / 10;
		}
		
		//Prints sum of number
		System.out.println("Sum of digits: " + sum);
		
	}

} 

