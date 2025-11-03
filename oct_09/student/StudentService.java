public class StudentService {
  public static void printStudentsWithMoreThanAvgMarks(Student[] students) {
    int totalMarks = 0;
    for (Student student : students) {
      totalMarks += student.marks;
    }
    int avgMarks = totalMarks / students.length;

    for (Student student : students) {
      if (student.marks > avgMarks) System.out.println(student);
    }
  }
}
