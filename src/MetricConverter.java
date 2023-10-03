import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters;

        do {
            System.out.print("Enter a measurement in meters: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
            meters = in.nextDouble();
        } while (meters <= 0);

        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        System.out.println(meters + " meters is equivalent to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");

        in.close();
    }
}
