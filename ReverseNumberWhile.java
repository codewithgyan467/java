import java.util.Scanner;

public class ReverseNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long num = sc.nextLong();

        long n = Math.abs(num);
        long rev = 0;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        if (num < 0) rev = -rev; // keep negative sign

        System.out.println("Reversed number: " + rev);
        sc.close();
    }
}
