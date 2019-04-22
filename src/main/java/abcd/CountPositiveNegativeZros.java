package abcd;

import java.util.Scanner;

public class CountPositiveNegativeZros {
    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in );

        int countPositive = 0,
                countNegative = 0,
                countZero = 0;

        char choice;
        do {
            System.out.println( "Enter the Number  : " );
            int number = scan.nextInt();

            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = scan.next().charAt(0);

        }
        while(choice=='y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);


    }
}
