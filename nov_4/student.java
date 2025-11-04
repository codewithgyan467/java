import java.util.Scanner;

public class student{
  protected int roll_no;
  protected String name;
  protected int semester;
  protected String branch;

  public void setData(int roll_no, String name, int semester, String branch) {
    this.roll_no = roll_no;
    this.name = name;
    this.semester = semester;
    this.branch = branch;
  } 

  public double calculate() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter marks for 5 subjects:");
    double totalMarks = 0;
    for (int i = 0; i < 5; i++) {
      System.out.print("Subject " + (i + 1) + ": ");
      totalMarks += scanner.nextDouble();
    }
    scanner.close();
    return (totalMarks / 500) * 100; 
  }

  public void showData() {
    System.out.println("Roll No: " + roll_no);
    System.out.println("Name: " + name);
    System.out.println("Semester: " + semester);
    System.out.println("Branch: " + branch);
  }

}
