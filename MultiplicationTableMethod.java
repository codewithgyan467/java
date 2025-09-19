import java.util.Scanner;

public class MultiplicationTableMethod {

    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, (n * i));
        }
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            printTable(n);
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer.");
        }
    }
}
