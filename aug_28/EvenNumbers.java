import java.util.Scanner;

public class EvenNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the n times to print even numbers: ");
    int num = sc.nextInt();

    if (num >= 0) {
      int n = 0;
      for (int i = 1; n != num; ++i) {
        if (i % 2 == 0) {
          System.out.println(i);
	  n++;
	}
      }
    } else {
      System.out.println("Invalid number");
    }
  }
}
