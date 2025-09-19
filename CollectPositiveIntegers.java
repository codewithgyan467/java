import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectPositiveIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            List<Integer> validInputs = new ArrayList<>();

        System.out.println("Enter positive integers. The input will stop if you enter a");
        System.out.println("negative number or any non-integer value.");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
if (number < 0) {
                break;
            }
            validInputs.add(number);
        }

        System.out.println("\n--- Valid Inputs Received ---");
        if (validInputs.isEmpty()) {
            System.out.println("No positive integers were entered.");
        } else {
            System.out.println("The list of positive integers you entered is: " + validInputs);
        }

        scanner.close();
    }
}