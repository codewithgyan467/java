import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            sc.close();
            return;
        }

        long result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " = " + result);
        sc.close();
    }
}
