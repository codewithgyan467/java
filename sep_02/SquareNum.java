// 1. WAP to find square of a number using a method.

import java.util.Scanner;

public class SquareNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int square = calcSquare(num);
    sc.close();
 
    System.out.printf("Square of %d is %d.", num, square);
  }

  public static int calcSquare(int num) {
    return num * num;
  } 
}
