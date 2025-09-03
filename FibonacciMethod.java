import java.util.Scanner;

public class FibonacciMethod {

    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i == n ? "" : " "));
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number.");
        } else {
            printFibonacci(n);
        }
        sc.close();
    }
}
