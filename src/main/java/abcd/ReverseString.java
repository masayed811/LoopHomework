package abcd;

import java.util.Scanner;

public class ReverseString {
    public static  void main(String[] args) {
        System.out.println( "Enter any String " );
        Scanner scanner = new Scanner( System.in );
        String input = scanner.next();

        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print( try1[i] );

    }


}

