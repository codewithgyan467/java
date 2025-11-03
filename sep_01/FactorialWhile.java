// 6. WAP to find the factorial of a number using while

import java.util.Scanner;

public class FactorialWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int factorial = num;
        int i = num - 1;
        while (i > 0) {
            factorial *= i--;
        }
        System.out.println("Factorial: " + factorial);
    }
}
