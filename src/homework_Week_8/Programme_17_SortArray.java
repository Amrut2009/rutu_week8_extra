package homework_Week_8;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Programme_17_SortArray {
    public static void main(String[] args) {
        //numeric Array declaration
         int [] numArray  ={
                 1789,2035,2040,1899,1950,2255,7897,1455,757,};
         //String Array declaration
        String []strArray ={
             "Alpha", "Bravo ", "Delta", "hotel","mike" ,"Sierra" ,"peter","Kilo"};
        System.out.println("Actual Numerical Array was : " + Arrays.toString(numArray));
        //sorting the Array
        Arrays.sort (numArray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        //Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));
    }
         }



