import java.util.Scanner;

public class IsLeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter year: ");
    int year = sc.nextInt();

    System.out.print(year + " is a ");
    if (year % 400 == 0 || year % 100 == 0 || year % 4 == 0) {
      System.out.println("leap year");
    } else {
      System.out.println("non-leap year");
    }
  }
}
