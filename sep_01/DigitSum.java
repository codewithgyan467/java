// 5. WAP to find the sum of digits of a number.

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        while (num > 0) {
            sum += num--;
        }

        System.out.println(sum);
    }
}
