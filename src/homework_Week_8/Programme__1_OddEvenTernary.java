package homework_Week_8;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme__1_OddEvenTernary {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the number :");
        int number =scanner.nextInt();
        isItOddOrEvenNumber(number);
        //cosing the scanner object
        scanner.close();

    }
    //checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd =(number % 2== 0) ? "even" : "odd";
        System.out.println("The "+number+"is "+ evenOrOdd+"number");
    }
}
