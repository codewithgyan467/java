import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionn{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        try {
            System.out.print("Enter the index to access: ");
            int index = scanner.nextInt();
          
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.err.println("Please check the index value. It is exceeding the array limit.");
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }

        System.out.println("Program continues after the exception.");
    }
}
