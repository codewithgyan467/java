// 7. WAP to find the factorial of a number using do-while

import java.util.Scanner;

public class FactorialDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int factorial = num;
        int i = num - 1;
        do {
            factorial *= i--;
        } while (i > 0);
        System.out.println("Factorial: " + factorial);
    }
}
