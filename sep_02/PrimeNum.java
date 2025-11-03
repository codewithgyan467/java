// 2. WAP to find if a number is prime using a method.

import java.util.Scanner;

public class PrimeNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    boolean isPrime = isPrime(num);
    sc.close();

    if (isPrime) {
      System.out.println("The provided number is prime.");
    } else {
      System.out.println("The provided number is not prime.");
    } 
  }

  public static boolean isPrime(int num) {
    if (num < 2) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;
 
    for (int i = 3; i * i < num; i += 2) {
      if (num % i == 0) return false;
    }
    return true;
  } 
}
