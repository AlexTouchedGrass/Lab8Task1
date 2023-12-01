
import java.util.Scanner;

public class Lab8Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalCost = 0.0;
        boolean done = false;


        //%10 Store
        //ABSOLUTE MIN = $0.50
        //ABSOLUTE MAX = $9.99

        do {
            double getPrice = InputHelper.getRangedDouble(scan, "Please enter item(s) price. \n(Remember this is the $10 store so no more than $9.99 and no less than %0.50)", 0.5, 9.99);

            totalCost += getPrice;
            String getConfirm = InputHelper.getYNConfirm(scan, "Please enter Y if you would like to add another item, and N if you would like to end transaction.");

            if (getConfirm == "NO"){
                done = true;
            }
        } while (!done);
        System.out.printf("Your Total Cost is %6.2f", totalCost);
    }
}