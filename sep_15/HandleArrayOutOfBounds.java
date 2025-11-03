// 1. WAP to demonstrate handling of ArrayOutOFBoundsException.

import java.util.Arrays;
import java.util.Scanner;

public class HandleArrayOutOfBounds {

    public static void main(String[] args) {
        int[] arr = {4, 6, 6, 2};
        System.out.println("Array: " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the element to print: ");
        int index = sc.nextInt();
        sc.nextLine();
        sc.close();

        try {
            System.out.println("Element having index " + index + " is " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("[ERR] The provided index is invalid!");
        }
    }
}
