package abcd;

import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {
        System.out.println( "Enter  a Number  :  " );
        Scanner scan=new Scanner( System.in );
        int number=scan.nextInt();
int D,reversed=0;


        while(number != 0) {
            D = number % 10;
            reversed = reversed * 10 + D;
            number /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
