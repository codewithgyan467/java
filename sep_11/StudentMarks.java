public class StudentMarks {
  public static void main(String[] args) {
    Student student = new Student();

    student.setRollNo(25);
    student.setMarks(70);
    student.display();
  }
}

class Student {
  int rollNo;
  int marks;

  Student() {
    this.rollNo = 0;
    this.marks = 0;
  }

  void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }

  void setMarks(int marks) {
    this.marks = marks;
  }

  void display() {
    System.out.println("Roll No: " + rollNo);
    System.out.println("Marks: " + marks);
  }
}
