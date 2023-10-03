import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        while(true){
            try{
                System.out.print ("Enter a temperature in Celsius: ");
                celsius = in.nextDouble();

                fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit);

                if (celsius == 0) {
                    System.out.println("This is the freezing point of water.");
                } else if (celsius == 100) {
                    System.out.println("This is the boiling point of water.");
                }

                break; //Exit loop if input and conversion are successful
            } catch (java.util.InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
    }
        in.close();
    }
}