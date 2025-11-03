// 3. WAP to reverse a string

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    sc.close();

    System.out.print("Reversed string: ");
    int len = str.length() - 1;
    for (int i = len; i >= 0; i--) {
        System.out.print(str.charAt(i));
    }
  }
}