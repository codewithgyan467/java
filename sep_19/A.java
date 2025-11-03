// 1. WAP to read N integers into an array and print only those that are divisible by 3 or 5.

import java.util.ArrayList;
import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();

    while (true) {
      System.out.print("Enter an integer: ");
      if (!sc.hasNextInt()) break;
      arr.add(sc.nextInt());
      sc.nextLine();
    }

    for (int element : arr) {
      if (element % 3 == 0 || element % 5 == 0) {
        System.out.print(element + " ");
      }
    }

    sc.close();
  }
}
