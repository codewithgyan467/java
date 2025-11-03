public class SalaryCalculator {
  public static void main(String[] args) {
    Employee emp1 = new Employee("John", 35000);
    System.out.println("HRA: " + emp1.calcHra());
    System.out.println("Basic Salary: " + emp1.basicSalary());
  }
}
