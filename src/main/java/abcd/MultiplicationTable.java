package abcd;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println( "Enter a Number to print it's multiplication table : " );
        Scanner scan=new Scanner( System.in );
        int N= scan.nextInt();
        System.out.println("Multiplication table of " + N);
        for (int i = 1; i <= 12; i++)
            System.out.println(N + " X " + i + " = " + (N*i));
    }
}
