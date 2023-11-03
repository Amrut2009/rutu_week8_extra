package homework_Week_8;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Programme_3_MarkSheet {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student Name        \t \t:\t");
        String name = scanner.nextLine();
        System.out.println("Enter Student Roll Number \t\t:\t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter mark of subject maths \t\t:\t");
        int mathsMarks = scanner.nextInt();
        if (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid  input ,marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of subject Science\t:\t");
        int ScienceMarks = scanner.nextInt();
        if (ScienceMarks < 0 || ScienceMarks > 100) {
            System.out.println("\nInvalid input , marks should between 0 to 100 ");
            System.out.println("Please enter correct marks \t\t:\t");
            ScienceMarks = scanner.nextInt();
        }
        System.out.println("Enter marks of Subject English\t:\t");
        int EnglishMarks = scanner.nextInt();
        if (EnglishMarks < 0 || EnglishMarks > 100) {
            System.out.println("\nInvalid input ,marks should between 0 to 100");
            System.out.println("\nPlease Enter correct mark \t\t:\t");
            EnglishMarks = scanner.nextInt();
        }
        int total = sum(mathsMarks, ScienceMarks, EnglishMarks);
        int percentage = (total * 100 / 300);
        String result = calculateResult(mathsMarks, ScienceMarks, EnglishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarksSheet (name, rollNum, mathsMarks, ScienceMarks, EnglishMarks, total, percentage ,result, grade);
        //Closing the scanner object
        scanner.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculating the grade on percentage  and result
    public static String calculateResult(int mathMarks, int ScienceMarks, int EnglishMarks) {
        if (mathMarks < 35 || ScienceMarks < 35 || EnglishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";

        }
    }
    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }
    //Printing the marks sheet
    public static void printTheMarksSheet (String name , int rollNum , int  mathMarks ,int ScienceMarks  , int EnglishMarks ,double total, double percentage , String result , String grade  ){

        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" +mathMarks + "                   |");
        System.out.println("| Science:" + ScienceMarks + "                |");
        System.out.println("| English:" + EnglishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|__________________________|");
    }

}

