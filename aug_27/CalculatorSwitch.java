import java.util.Scanner;

public class CalculatorSwitch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number 1: ");
    int num1 = sc.nextInt();
 
    System.out.print("Enter the operator (+, -, *, /) to use: ");
    char oprt = sc.next().charAt(0);
    sc.nextLine();
 
    System.out.print("Enter number 2: ");
    int num2 = sc.nextInt();

    switch (oprt) {
      case '+':
        System.out.println("Sum: " + (num1 + num2));
        break;
      case '-':
        System.out.println("Difference: " + (num1 - num2));
	break;
      case '*':
        System.out.println("Product: " + (num1 * num2));
	break;
      case '/':
        System.out.println("Quotient: " + (num1 / num2));
	break;
      default:
        System.out.println("Invalid operator!");
	break;
    }
  }
}
