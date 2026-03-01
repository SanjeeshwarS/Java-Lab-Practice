import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("Length of side = " + side);
        System.out.println("Perimeter = " + perimeter);

        input.close();
    }
}