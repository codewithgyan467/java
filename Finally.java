import java.util.Scanner;

public class Finally{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num > 10) {
                throw new Exception("Number is greater than 10");
            }

            System.out.println("Number is: " + num);

        } catch (java.util.InputMismatchException e) {
            System.err.println("Caught InputMismatchException: " + e.getMessage());
            System.err.println("Invalid input. Please enter an integer.");
        }
        catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Finally closed.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
