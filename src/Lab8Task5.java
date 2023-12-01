
import java.util.Scanner;

public class Lab8Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Social Security
        String ssn = InputHelper.getRegExString(scan, "Please enter your SSN [xxx-xx-xxxx]", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN: " + ssn + ".");

        String mNum = InputHelper.getRegExString(scan, "Please enter your M Number","(M|m)\\d{5}");
        System.out.println("Your M Number: " +mNum+".");

        String menuWHAT = InputHelper.getRegExString(scan," Menu: \nO - Open  \nS - Save  \nV - View  \nQ - Quit","\\[OoSsVvQq]");
        System.out.println("You Choose: "+ menuWHAT);







    }
}