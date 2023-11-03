package homework_Week_8;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6_OddEven {
    public static void main (String[]args) {
        //Scanner declaration for reading input form concole 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to  check :");
        int number = scanner.nextInt();
        Programme_6_OddEven OddEven = new Programme_6_OddEven();
        System.out.println(number + "is" + OddEven.isItEvenOrIddNumber(number) + "number");
        //closing the scanner object
        scanner.close();

    }
    //checking the odd or even 
    public String isItEvenOrIddNumber(int number){
        if(number %2 ==0) {
            return "Even";
        }else{
            return "odd";
            
        }
    }
}
