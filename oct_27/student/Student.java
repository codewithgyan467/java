public class Student extends Marks {
  private String name;
  private int rollNo;
  
  public Student(String name, int rollNo, int marks) {
    this.name = name;
    this.rollNo = rollNo;
    this.marks = marks;
  }

  public String display() {
    return String.format(
      "Student Name: %s%nStudent Roll No: %d%nStudent Marks: %d (Grade: %s)%n",
      name,
      rollNo,
      marks,
      calculateGrade()
    );
  }
}
