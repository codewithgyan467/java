// 2. Create a program that reads multiple inputs from the user. Use hasNextInt() to count how
//    many valid integers the user has entered before entering a non-integer.

import java.util.Scanner;

public class CountValidIsInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	int count = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                System.out.println("You've entered: " + value);
		count++;
            } else {
                System.out.println("Error: Invalid integer provided!!");
		System.out.println("You have entered " + count + " valid integers!");
                break;
            }
        }

        sc.close();
    }
}
