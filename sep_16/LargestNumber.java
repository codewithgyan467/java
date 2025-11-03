// 5. WAP that keeps reading integers from the user using hasNextInt() until a non-integer is
//    entered, then prints the largest number entered.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	int largestNum = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
		if (value > largestNum) largestNum = value;
            } else {
                System.out.println("Error: Invalid integer provided!!");
		System.out.println("Largest number: " + largestNum);
                break;
            }
        }

        sc.close();
    }
}
