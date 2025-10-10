//Write a Java program that sort an array with duplicate elements and remove duplicates after sorting.

import java.util.Scanner;
import java.util.Arrays;
public class duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; 
                }
            }
        }
        System.out.println();

        scanner.close();
    }

    
}
