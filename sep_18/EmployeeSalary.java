public class EmployeeSalary {
  public static void main(String[] args) {
    Employee emp = new Employee("John", 35000);
    System.out.println("Gross Salary of " + emp.name + ": " + emp.grossSalary());
  }
}

class Employee {
  String name;
  double basicSalary;

  Employee(String name, double basicSalary) {
    this.name = name;
    this.basicSalary = basicSalary;
  }

  public double grossSalary() {
    return basicSalary + 0.1 + 1.2;
  }
}
