package org.example;
import java.util.Calendar;
import java.util.Scanner;

public class retirement {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("What is your current age? ");
        int currentAge = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retireAge = input.nextInt();

        int left = retireAge - currentAge;
        System.out.println("You have " + left + " years left until you can retire.");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = year + left;

        System.out.println("It's " + year + ", so you can retire in " + retireYear + ".");

    }

}
