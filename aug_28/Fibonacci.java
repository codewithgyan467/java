
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of terms: ");
        int maxRange = sc.nextInt();

        if (maxRange < 0) {
            System.out.println("Number of terms cannot be negative.");
        } else if (maxRange == 0) {
            System.out.println("The Fibonacci series up to 0 terms: (empty)");
        } else if (maxRange == 1) {
            System.out.println("The Fibonacci series up to 1 term: 0");
        } else {
            int firstTerm = 0;
            int secondTerm = 1;

            System.out.print("The Fibonacci series up to " + maxRange + " terms: ");
            System.out.print(firstTerm + " " + secondTerm + " ");

            for (int i = 2; i < maxRange; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(nextTerm + " ");
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
        sc.close();
    }
}
