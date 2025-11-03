public class Student {
  String name;
  int rollNumber;
  int marks;

  Student(String name, int rollNumber, int marks) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.marks = marks;
  }

  @Override
  public String toString() {
    return "Student(name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + ")";
  }
}
