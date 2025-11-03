
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int factorial = num;
        for (int i = num - 1; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
