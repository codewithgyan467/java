import java.util.Scanner;

public class MultipleExceptions{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Enter a numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter a denominator: ");
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);

           
            int[] arr = {1, 2, 3};
            System.out.print("Enter the index to access in the array: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);

        
            System.out.print("Enter a number to convert to integer: ");
            String numStr = scanner.next();
            int num = Integer.parseInt(numStr);
            System.out.println("Parsed integer: " + num);

        } catch (ArithmeticException e) {
            System.err.println("Caught ArithmeticException: " + e.getMessage());
            System.err.println("Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.err.println("Invalid index. Please provide a valid index within the array bounds.");
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " + e.getMessage());
            System.err.println("Invalid input. Please enter a valid number string.");
        } catch (Exception e) {
            System.err.println("Caught an unexpected exception: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner is closed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
