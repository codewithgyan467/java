import java.util.Scanner;

public class PalindromeMethod {

    static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return original == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a Palindrome.");
        } else {
            System.out.println(n + " is NOT a Palindrome.");
        }
        sc.close();
    }
}
