


/*Program calculates the profit of the 
 * airlines and shows the total expenses.
 */

import java.util.Scanner;

public class AirlineProfit {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		
		//Variables
		double distance, fuelCostPerGallon, 
		totalFuelCost, totalPassengers, averageTicketCost, 
		totalProfit, averageGasMileagePerPerson;
		
		System.out.print("Enter the flight distance: ");
		distance = scan.nextDouble();
		System.out.print("Enter the current cost of jet fuel: $");
		fuelCostPerGallon = scan.nextDouble();
		
		totalFuelCost = (distance * fuelCostPerGallon) * 5;
		
		System.out.println("The flight will cost $" + totalFuelCost + " in fuel.");
		
		System.out.print("Enter the number of passengers: ");
		totalPassengers = scan.nextDouble();
		System.out.print("Enter the average cost of a ticket: ");
		averageTicketCost = scan.nextDouble();
		
		totalProfit = (totalPassengers * averageTicketCost) - totalFuelCost;
		
		System.out.println("You will make a profit of $" + totalProfit);
		
		averageGasMileagePerPerson = totalPassengers / 5;
		
		System.out.print("You averaged " + averageGasMileagePerPerson 
				+ " miles per person per gallon!");

		
	}

}