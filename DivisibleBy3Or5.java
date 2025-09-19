import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DivisibleBy3Or5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the number of elements required:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number of elements must be positive.");
            scanner.close();
            return;
        }

        int[] numbers = new int[n];

       
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        
        List<Integer> divisibleNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 3 == 0 || number % 5 == 0) {
                divisibleNumbers.add(number);
            }
        }


        if (divisibleNumbers.isEmpty()) {
            System.out.println("No numbers divisible by 3 or 5 were found.");
        } else {
            System.out.println("The numbers divisible by 3 or 5 are:");
            for (int i = 0; i < divisibleNumbers.size(); i++) {
                System.out.print(divisibleNumbers.get(i));
               
                if (i < divisibleNumbers.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(); 
        }

        scanner.close();
    }
}