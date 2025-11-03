import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number 1: ");
    int num1 = sc.nextInt();
 
    System.out.print("Enter the operator (+, -, *, /) to use: ");
    char oprt = sc.next().charAt(0);
    sc.nextLine();
 
    System.out.print("Enter number 2: ");
    int num2 = sc.nextInt();

    if (oprt == '+') {
      System.out.println("Sum: " + (num1 + num2));
    } else if (oprt == '-') {
      System.out.println("Difference: " + (num1 - num2));
    } else if (oprt == '*') {
      System.out.println("Product: " + (num1 * num2));
    } else if (oprt == '/') {
      System.out.println("Quotient: " + (num1 / num2));
    } else {
      System.out.println("Invalid operator!");
    }
  }
}
