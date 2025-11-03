// Q. Write a program to print N natural number in reverse order.

import java.util.Scanner;

public class NaturalNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();

    for (int i = num; i > 0; i--) {
      System.out.println(i);
    }
  }
}
