import java.util.Scanner;

public class Lab8Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputUsername = InputHelper.getNonZeroLenString(scan, "Please enter a username you would like to be known by below.");
        System.out.println("Your chosen username is " + inputUsername);


    }
}