// 2. WAP to find the Fibonacci series upto N terms using recursion.

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the no. of terms: ");
    int terms = sc.nextInt();
    sc.close();

    String series = fibonacci(terms);
    System.out.printf("Fibonacci series upto %d terms:\n", series);
  }

  public static String fibonacci(int upto) {
    int sum = 0;
    
    if (upto < 1) return 0;
    return upto + fibonacci(upto - 1);
  }
}