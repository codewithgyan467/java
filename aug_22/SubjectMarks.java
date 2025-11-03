import java.util.Scanner;

public class SubjectMarks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter subject 1 marks: ");
    int sub1 = sc.nextInt();
 
    System.out.print("Enter subject 2 marks: ");
    int sub2 = sc.nextInt();

    System.out.print("Enter subject 3 marks: ");
    int sub3 = sc.nextInt();

    System.out.print("Enter subject 4 marks: ");
    int sub4 = sc.nextInt();

    System.out.print("Enter subject 5 marks: ");
    int sub5 = sc.nextInt();
    sc.close();

    int total = sub1 + sub2 + sub3 + sub4 + sub5;
    System.out.println("Total: " + total);

    int average = total / 5;
    System.out.println("Average: " + average);

    float percentage = ((float) total / 500) * 100;
    System.out.println("Percentage: " + percentage + "%");
  }
}
