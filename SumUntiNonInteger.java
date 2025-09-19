import java.util.Scanner;

public class SumUntiNonInteger {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        int sum = 0;

        
        System.out.println("Enter integers to calculate their sum.");
        System.out.println("Enter any non-integer value (like a letter) to stop.");

       
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
        }

       System.out.println("The sum of the entered integers is: " + sum);
       scanner.close();
    }
}
