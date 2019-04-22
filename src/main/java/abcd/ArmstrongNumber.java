package abcd;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println( "Enter three digit number " );
        Scanner scanner = new Scanner( System.in );
        int number = scanner.nextInt();
        int a, b, i;

        int armumber = 0;

        b = number;

        for (i = 0; i >= 0; i++) {
            a = number % 10;
            armumber = armumber + (a * a * a);
            number = number / 10;

        }
        if (armumber == b) {
            System.out.println( "The Number is Armstrong " );

        } else {
            System.out.println( "The number is not Armstrong" );
        }


    }}




//         int num, number, temp, total = 0;
//        System.out.println("Ënter 3 Digit Number");
//        Scanner scanner = new Scanner(System.in);
//        num = scanner.nextInt();
//        scanner.close();
//        number = num;
//
//        for( ;number!=0;number /= 10)
//        {
//            temp = number % 10;
//            total = total + temp*temp*temp;
//        }
//
//        if(total == num)
//            System.out.println(num + " is an Armstrong number");
//        else
//            System.out.println(num + " is not an Armstrong number");
//    }
//}
