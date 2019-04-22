package abcd;

import java.util.Scanner;

public class SumOfInputDigit {

    static int getSum(int number)
    {
        int sum;

        /* Single line that calculates sum */
        for (sum = 0; number > 0; sum += number % 10,
                number /= 10);

        return sum;
    }
    public static void main(String[] args) {
        System.out.println( "Enter any Digits number " );
            Scanner scan = new Scanner( System.in );
    int number= scan.nextInt();
        System.out.println("Enter all Digits Total is :"+getSum(number));

        }
    }


