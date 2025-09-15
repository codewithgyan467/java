//⁠Create a class Student with fields for rollNo and marks. Write methods to set values and display them using an object.
 class Student {
    int rollNo;
    int marks;

   
    void setValues(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        
        s1.setValues(101, 85);

        
        System.out.println("Student Details:");
        s1.display();
    }
}
