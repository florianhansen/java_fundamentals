package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Getting input
        Scanner scan = new Scanner(System.in);
        System.out.print("Please give a number between 1 to 10: ");
        int scanned = scan.nextInt();

        //Getting the index
        int diff = 1;
        int i=0;
        while(diff!=0){
            diff= array[i]-scanned;
            i++;
        }

        System.out.println("The index is "+ (i-1));

    }

}