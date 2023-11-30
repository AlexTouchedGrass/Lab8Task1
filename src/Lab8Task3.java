import sun.java2d.InvalidPipeException;

import java.util.Scanner;

public class Lab8Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput;

        int intDay = 0;
        int intMonth = 0;
        int intYear = 0;
        int max = 0;

        /* The Months of the year arranged from least to most.
        2/28 days - February (ignoring leap years)
        4/30 days - April
        6/30 days - June
        9/30 days - September
        11/30 days - November
        1/31 days - January ..
        3/31 days - March ..
        5/31 days - May ..
        7/31 days - July ..
        8/31 days - August ..
        10/31 days - October ..
        12/31 days - December ..
         */


        int getYear = InputHelper.getRangedInt(scan, "Please enter your year of birth (1950-2010)",1950,2010);
        int getMonth = InputHelper.getRangedInt(scan, "Please enter your month of birth (1-12)",1,12);

        //figure out the days via month //Edit : I should've made the months with 31 days the final, but I thought 30 days was the most common.
        if (getMonth == 12 || getMonth == 10 || getMonth == 1 || getMonth == 8 || getMonth == 3 || getMonth == 7 || getMonth == 5) {
            max = 31;
        } else if (getMonth == 2) {
            max = 28;
        } else {
            max = 30;
        }


        int getDay = InputHelper.getRangedInt(scan, "Please enter your day of birth (1-"+max + ")",1,max);
        int getMinute = InputHelper.getRangedInt(scan, "Please enter your minutes of birth (1-60)",1,60);
        int getSecond = InputHelper.getRangedInt(scan, "Please enter your seconds of birth (1-60)",1,60);







    }
}