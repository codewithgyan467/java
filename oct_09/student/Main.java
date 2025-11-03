public class Main {
  public static void main(String[] args) {
    Student[] students = {
      new Student("Abhinash", 1, 67),
      new Student("Aditya", 2, 56),
      new Student("Bhargav", 5, 89),
      new Student("Dhritiman", 6, 34),
    };

    StudentService.printStudentsWithMoreThanAvgMarks(students);
  }
}
