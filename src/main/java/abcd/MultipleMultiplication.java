package abcd;

import java.util.Scanner;

public class MultipleMultiplication {
    public static void main(String[] args) {
        int result ,number, i,j;
        System.out.println( "Enter the number for Mutiplication :" );
        Scanner scan = new Scanner( System.in );
        number = scan.nextInt();

        for (  i = 1; i <= number; i++){
            for( j=1; j<= 10; j++){
                result =   j*i ;

                System.out.println( "\t\t"+i+" X "+j+" = "+result );}
                System.out.println("");
            }
        }

    }
