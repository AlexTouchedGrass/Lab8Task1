import java.util.Scanner;

public class Lab8Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = "";
        boolean done = false;

        do{
            System.out.println("Please enter a message to be centered.");
            msg = scan.nextLine();

            if(msg.length()<54){
                done = true;
            }
        } while(!done);

        getPrettyHeader(msg);
    }

    public static void getPrettyHeader(String msg) {
        int leftSpaces = ((54-msg.length())/2);
        int rightSpaces = (54-leftSpaces-msg.length());

        printCharacter("*", 60, true);

        printCharacter("*",3, false);
        printCharacter(" ", leftSpaces, false);
        System.out.print(msg);
        printCharacter(" ", rightSpaces, false);
        printCharacter("*", 3, true);

        printCharacter("*", 60, false);
    }

    public static void printCharacter(String character, int amount, boolean newLine) {
        for (int i = 0; i < amount; i++) {
            System.out.print(character);
        }

        if (newLine) {
            System.out.println();
        }
    }
}