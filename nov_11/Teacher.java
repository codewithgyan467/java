public class Teacher {
    String name;
    String address;
    String phoneNumber;
public Teacher() {
        return;
    }

    public Teacher(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void displayTeacherInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

class MathTeacher extends Teacher {
    String subjectSpecialization;

    public MathTeacher(String name, String address, String phoneNumber, String subjectSpecialization) {
        super(name, address, phoneNumber);
        this.subjectSpecialization = subjectSpecialization;
    }

    public String getSubject() {
        return "Mathematics";
    }

    public String getSubjectDescription() {
        return "Teaching various branches of computer including programming, data structures, algorithms, and software development.";
    }

    @Override
    public void displayTeacherInfo() {
        super.displayTeacherInfo();
        System.out.println("Subject: " + getSubject());
        System.out.println("Specialization: " + subjectSpecialization);
        System.out.println("Description: " + getSubjectDescription());
    }

public static void main(String[] args){
    MathTeacher mathTeacher = new MathTeacher("Gyanbhai", "123 Main St", "5551234", "Computer science");
    mathTeacher.displayTeacherInfo();
}
}