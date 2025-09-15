import java.util.Scanner;

public class StringToIntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a numeric string: ");
        String numStr = sc.nextLine();

      
        int number = Integer.parseInt(numStr);

       
        int sum = number + 10;
        int product = number * 2;

         System.out.println("Original number: " + number);
        System.out.println("After adding 10: " + sum);
        System.out.println("After multiplying by 2: " + product);

        sc.close();
    }
}
