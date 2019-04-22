package abcd;

import java.util.Scanner;

public class CountTotalNumberA {
    public static void main(String[] args) {
        System.out.println( "Enter any String with A : " );
        Scanner scan = new Scanner( System.in );
        String str = scan.nextLine();
         System.out.println("Number of  A in the string: " +Count_A(str));

    }

    public static int Count_A(String str)

    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt( i ) == 'a') {
                count++;
            }
        }
        return count;
    }
}

