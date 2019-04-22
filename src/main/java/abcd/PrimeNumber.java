package abcd;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println( "Enter Any Number" );
        Scanner scan = new Scanner( System.in );
        int number = scan.nextInt();
        int i;
        boolean flag = true;

        if (number == 0 || number == 1) {
            System.out.println( number + " : is not prime number" );
        } else {
            for (i = 2; i <= number / 2; i++) ;
            {
                if (number % i == 0) {
                    // flag = false;
                    System.out.println( number + "  : is not prime " );


                } else {
                    System.out.println( number + "  : is prime" );

                }
            }
        }}}




