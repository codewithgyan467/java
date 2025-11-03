// 3. WAP that reads an array of integers from the user and prints the second largest no. without sorting the entire array.

import java.util.Scanner;

public class SecondLargest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter the number of integers to take input: ");
    int num = sc.nextInt();

    // Stop program if input num is less than 1.
    if (num < 1) {
      System.out.println("Error: The number must not be less than 1.");
      return;
    }

    // Create a array with num length
    int[] arr = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.print("Num " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
      sc.nextLine(); // Clear the remaining buffer
    }

    int largestNum1 = arr[0];
    int largestNum2 = arr[0];
 
    for (int element : arr) {
      if (element > largestNum2) {
        largestNum1 = largestNum2;
	largestNum2 = element;
 
      }
    }

    System.out.println("2nd Largest integer provided: " + largestNum1);
    sc.close(); // Close the scanner.
  }
}
