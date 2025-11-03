import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the no. of terms: ");
    int terms = sc.nextInt();
    sc.close();
    printFibonacci(terms);
  }

  public static void printFibonacci(int terms) {
    int firstTerm = 0;
    int secondTerm = 1;

    int sum = 0;
    for (int i = 0; i < terms; i++) {
      System.out.print(firstTerm + " ");
      System.out.print(secondTerm + " ");
      sum = firstTerm + secondTerm;
      firstTerm = sum;
      secondTerm += sum;
    }
    System.out.println(" ");
  }
}
