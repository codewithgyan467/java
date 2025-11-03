// 1. WAP that repeatedly asks the user for input and uses hasNextInt() to check
//    if the entered value is an integer. IF it is, print the value; otherwise,
//    display an error message and stop.

import java.util.Scanner;

public class IsInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer: ");
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                System.out.println("You've entered: " + value);
            } else {
                System.out.println("Error: Provided input is not a valid integer!!");
                break;
            }
        }

        sc.close();
    }
}
