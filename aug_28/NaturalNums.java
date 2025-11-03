import java.util.Scanner;

public class NaturalNums {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the n times to print the sum of natural numbers: ");
    int num = sc.nextInt();

    if (num >= 0) {
      int sum = 0;

      for (int i = 1; i <= num; ++i) {
        sum += i;
	System.out.print(i + " ");
      }
      System.out.println("\nSum: " + sum);
    } else {
      System.out.println("Invalid number");
    }
  }
}
