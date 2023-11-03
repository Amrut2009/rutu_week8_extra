package homework_Week_8;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //Closing the scanner object
        scanner.close();
    }
    //finding the number is positive Nageative or zero
    public  static void findNumberIsPositiveNegativeOrZero(int number){
        if (number >0 ) {
            System.out.println(number + "is a positive number");
        }else if (number <0 ) {
            System.out.println(number + "is a negative number ");
        }else {
            System.out.println(number + " is zero");
        }
    }

}
