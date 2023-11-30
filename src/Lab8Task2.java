import java.util.Scanner;

public class Lab8Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputFavInt = InputHelper.getInt(scan, "Please enter your favorite whole number below.");
        System.out.println("Your favorite number is " + inputFavInt);

        double inputFavDouble = InputHelper.getDouble(scan, "Please enter your favorite decimal number below.");
        System.out.println("Your favorite decimal number is " + inputFavDouble);

        System.out.println("\n\n"); //Just wanted some space between this and the end code.

        System.out.printf("Your favorite whole number is %2d",inputFavInt);
        System.out.printf("\nYour favorite decimal number is %2.2f", inputFavDouble);
    }
}