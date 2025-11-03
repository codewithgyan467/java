// 3. WAP that reads integers from the user until a non-integer is entered.
//    Use hasNextInt() to validate each input and calculate the sum of all
//    valid integers.

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	int sum = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                System.out.println("You've entered: " + value);
		sum += value;
            } else {
                System.out.println("Error: Invalid integer provided!!");
		System.out.println("Sum of all valid integers: " + sum);
                break;
            }
        }

        sc.close();
    }
}
