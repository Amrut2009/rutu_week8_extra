package homework_Week_8;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | DA 8% : 2250.0 |
 * | TA 9% : 2000.0 |
 * | PF - 20%; : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Programme_5_SalarySlip {

    public static void main(String[]args){
        //Scanner declaration for reading input form console
        Scanner scanner=new Scanner(System.in );
        System.out.println("Enter your Name :");
        String name =scanner.nextLine();

         System.out.println("Enter your EmployeeId :");
         int employeeId =scanner.nextInt();

        System.out.println("Enter Basic Salary :");
        double basicsSalary = scanner.nextDouble();

        // Calculating HRA,DA,TA and PF
        double hRA = calculateHRA(basicsSalary);
        double da = (basicsSalary);
        double ta = calculateTA(basicsSalary);
        double pf = calculatePF(basicsSalary);

        // Calculating the gross salary
        double grossSalary =basicsSalary + hRA + da + ta - pf;

        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeId + "                     |");
        System.out.println("|Employee Name:" + name + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " +basicsSalary + "                |");
        System.out.println("|HRA 10%     : " + hRA+ "                 |");
        System.out.println("|TA 8%       : " + ta + "                 |");
        System.out.println("|DA 9%       : " + da + "                 |");
        System.out.println("|PF -20%     : " + pf + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scanner.close();
    }



    // calculating HRA
    public  static double calculateHRA(double basicsSalary){
        return (basicsSalary *10) /100;
    }
   // calculating DA
            public static double calculatingDA(double basicsSalary){
        return (basicsSalary *8) /100;
            }
            //Calculating TA
    public static double calculateTA(double basicsSalary){
        return (basicsSalary *9) /100;
    }
       //Calculating PF
    public static double calculatePF(double basicsSalary ){
        return (basicsSalary *20 ) /100;

    }


}
