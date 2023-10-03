import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallonsInTank;
        double fuelEfficiency;
        double pricePerGallon;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            gallonsInTank = in.nextDouble();
        } while (gallonsInTank <= 0);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = in.nextDouble();
        } while (fuelEfficiency <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            pricePerGallon = in.nextDouble();
        } while (pricePerGallon <= 0);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double milesPossible = gallonsInTank * fuelEfficiency;

        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("The car can go approximately " + milesPossible + " miles with gas in the tank.");

        in.close();
    }
}

