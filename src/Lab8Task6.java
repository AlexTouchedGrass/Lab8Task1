import java.util.Scanner;

public class Lab8Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String msg = "";
        boolean done = false;

        do{
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
        int z = (54-msg.length()/2);
        for (int i = 0; i != 60; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 0; j <=54;j++) {
        }
        System.out.println();
        for (int i = 0; i != 60; i++) {
            System.out.print("*");
        }
    }
}