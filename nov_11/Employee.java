public class Employee {
    String name;
    String employeeId;
    double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Programmer extends Employee {
    String programmingLanguage;

    public Programmer(String name, String employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Gyandeep", "08", 9999999.0, "Java");
        System.out.println("--- Programmer Details ---");
        programmer.displayDetails();
    }
}
