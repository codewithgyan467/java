import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("N must be a positive integer.");
        } else {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += (long) i * i;
            }
            System.out.println("Sum of squares of first " + n + " natural numbers = " + sum);
        }
        sc.close();
    }
}
