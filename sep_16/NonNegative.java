// 4. Develop a program that uses hasNextInt() to read user inputs and only accepts
//    positive integers. Stop reading when a negative integer or non-integer is entered
//    and display the list of valid inputs.

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	ArrayList<Integer> arr = new ArrayList<Integer>();

        while (true) {
            System.out.print("Enter a positive integer: ");
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                if (value > 1) {
	           arr.add(value);
		} else {
                   System.out.println("Error: Expected +ve integer, got -ve integer.");
		   break;
		}
	    } else {
                System.out.println("Error: Invalid integer provided!!");
                break;
            }
        }

        System.out.println("Valid inputs provided: " + arr);
        sc.close();
    }
}
