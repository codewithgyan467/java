import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();

    int factorial = getFactorial(num);
    System.out.println("Factorial: " + factorial);
  }

  public static int getFactorial(int num) {
    int factorial = num;
    int i = num - 1;
    while (i > 0) factorial *= i--;
    return factorial;
  }
}
