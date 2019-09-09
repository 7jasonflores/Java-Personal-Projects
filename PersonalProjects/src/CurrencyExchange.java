


/*Program shows you the currency exchange rate 
 * for US Dollar.
 */

import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		
		//Variables
		double USD, currencyExchange, newCurrency;
		String currencyName;
		
		
		//Asking for input
		System.out.println("Enter name of new currency: ");
		currencyName = scan.nextLine();
		System.out.println("Enter currency exchange of $1 USD to new currency: ");
		USD = scan.nextDouble();
		System.out.println("Enter an amount in USD: $");
		currencyExchange = scan.nextDouble();
	
		
		//Calculation
		newCurrency = USD * currencyExchange;
		
		//Prints output
		System.out.println("You have " + newCurrency + " " + currencyName + ".");
		
		
	}

}
