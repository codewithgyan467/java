public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void compareRollNo(Student other) {
        if (this.rollNo > other.rollNo) {
            System.out.println(this.name + "'s roll number is higher than " + other.name + "'s.");
        } else if (this.rollNo < other.rollNo) {
            System.out.println(this.name + "'s roll number is lower than " + other.name + "'s.");
        } else {
            System.out.println(this.name + " and " + other.name + " have the same roll number.");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        student1.compareRollNo(student2);
    }
}
