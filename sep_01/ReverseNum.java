// 3. WAP to reverse a number using while loop.

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        while (num > 0) {
            System.out.println(num--);
        }
    }
}
