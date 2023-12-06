import java.util.Scanner;

public class Lab8Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = "";
        boolean done = false;
        String leftSpaces = "";
        String rightSpaces = "";

        do{
            System.out.println("Please enter a message to be centered.");
            msg = scan.nextLine();

            if(msg.length()<54){
                System.out.println("Good Length.");
                done = true;
            }
        } while(!done);

        getPrettyHeader(msg);
    }


    public static void getPrettyHeader(String msg) {
        boolean done = false;
        int leftSpaces = ((54-msg.length())/2);
        int rightSpaces = (54-leftSpaces-msg.length());
        int a = 0;
        for (int i = 0; i < 61; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int m = 0; m < 61;m++) {
            if (m<3||m>57) {
                System.out.print("*");
            }else if ( m > leftSpaces + 3 && m< 57- leftSpaces){
                System.out.print(msg.substring(a, a+1));
                a++;
            } else{
                System.out.print(" ");
            }
        }

        System.out.print(msg);

        System.out.println();
        for (int i = 0; i < 61; i++) {
            System.out.print("*");
        }
    }
}