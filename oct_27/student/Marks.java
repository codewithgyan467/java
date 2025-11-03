public class Marks {
  protected int marks;

  public char calculateGrade() {
    if (marks >= 90) return 'O';
    if (marks >= 80) return 'A';
    if (marks >= 70) return 'B';
    if (marks >= 60) return 'C';
    if (marks >= 50) return 'D';
    return 'F';
  }
}
