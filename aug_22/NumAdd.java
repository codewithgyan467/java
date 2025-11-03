import java.util.Scanner;

public class NumAdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter number 1: ");
    var num1 = sc.nextInt();

    System.out.print("Enter number 2: ");
    var num2 = sc.nextInt();
    sc.close();

    var sum = num1 + num2;

    System.out.println("Sum: " + sum);
  }
}
