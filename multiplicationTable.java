import java.util.Scanner;

// In Java, class names should be in PascalCase (e.g., MultiplicationTable).
// The filename must match the class name for the code to compile.
public class multiplicationTable {
    public static void main(String[] args) {
        // Using a try-with-resources block ensures the Scanner is always closed.
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                // System.printf provides a cleaner way to format output.
                System.out.printf("%d x %d = %d%n", num, i, (num * i));
            }
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input. Please enter an integer.");
        }
    }
}