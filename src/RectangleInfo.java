import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width;
        double height;

        do {
            System.out.print("Enter the width of the rectangle: ");
            width = in.nextDouble();
        } while (width <= 0);

        do {
            System.out.print("Enter the height of the rectangle: ");
            height = in.nextDouble();
        } while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);

        in.close();
    }
}
