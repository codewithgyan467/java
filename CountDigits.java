
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long num = sc.nextLong();
        long n = Math.abs(num);

        
        if (n == 0) {
            System.out.println("Number of digits: 1");
            sc.close();
            return;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }

        System.out.println("Number of digits in " + num + " = " + count);
        sc.close();
    }
}
