// 1. WAP to find the sum of N natural numbers using recursion.

import java.util.Scanner;

public class NaturalNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the no. of terms: ");
    int terms = sc.nextInt();
    sc.close();

    int sum = sumNaturalNums(terms);
    System.out.printf("Sum of %d natural nums is %d", terms, sum);
  }

  public static int sumNaturalNums(int upto) {
    if (upto < 1) return 0;
    return upto + sumNaturalNums(upto - 1);
  }
}