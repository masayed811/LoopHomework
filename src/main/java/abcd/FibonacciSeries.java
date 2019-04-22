package abcd;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println( "Enter the Fibonacci series Terms: " );
        Scanner scan=new Scanner( System.in );
        int n=scan.nextInt();


        int t1=0,t2=1;

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }
}
