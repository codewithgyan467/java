import java.util.Scanner;

public class SquareSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();

    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i * i;
    }

    System.out.println("Sum: " + sum);
  }
}
