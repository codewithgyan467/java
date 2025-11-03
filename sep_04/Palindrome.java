// 4. WAP to check whether a string is palindrome or not

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    sc.close();

    if (isPalindrome(str)) {
      System.out.println("The string is palindrome.");
    } else {
      System.out.println("The string is not palindrome.");
    }
  }

  public static boolean isPalindrome(String str) {
    String reverseStr = new StringBuilder(str).reverse().toString();
    return str.equals(reverseStr);
  }
}