import java.util.Scanner;

public class MarkToGrade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter subject mark: ");
    int mark = sc.nextInt();
    sc.close();

    System.out.print("Grade: ");
    if (mark > 89) {
      System.out.println("A");
    } else if (mark > 79) {
      System.out.println("B");
    } else if (mark > 69) {
      System.out.println("C");
    } else if (mark > 59) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
