

import java.util.List;
import java.util.ArrayList;


 
public class StudentService {

    /**
     * b) Calculates the average marks for a given list of students.
     */
    public double calculateAverageMarks(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return 0.0;
        }

        double totalMarks = 0.0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        return totalMarks / students.size();
    }

    /**
     * c) Prints students with marks greater than the average.
     */
    public void printStudentsAboveAverage(List<Student> students) {
        double averageMarks = calculateAverageMarks(students);
        System.out.printf("Average Marks: %.2f%n", averageMarks);
        System.out.println("------------------------------------");
        System.out.println("Students with marks > average:");

        boolean found = false;
        for (Student student : students) {
            if (student.getMarks() > averageMarks) {
                System.out.println(student);
                found = true;
            }
        }

        // Add a message if no students were found above the average.
        if (!found) {
            System.out.println("No students scored above the average.");
        }
    }
}