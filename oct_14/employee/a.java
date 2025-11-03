class Employee {
    String name;
    double basicSalary;
    double dearnessAllowance; // DA
    double houseRentAllowance; // HRA
    double grossSalary;

    // Constructor 1: Initializes with name and basic salary, calculates DA, HRA, and gross salary
    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        calculateAllowancesAndGrossSalary();
    }

    // Constructor 2: Initializes with name, basic salary, and custom DA/HRA percentages
    public Employee(String name, double basicSalary, double daPercentage, double hraPercentage) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.dearnessAllowance = basicSalary * (daPercentage / 100);
        this.houseRentAllowance = basicSalary * (hraPercentage / 100);
        this.grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;
    }

    // Helper method to calculate DA, HRA, and gross salary based on default rules
    private void calculateAllowancesAndGrossSalary() {
        // Default DA: 30% of basic salary
        this.dearnessAllowance = basicSalary * 0.30;

        // Default HRA: 35% if basic salary > 400, else 30%
        if (basicSalary > 400) {
            this.houseRentAllowance = basicSalary * 0.35;
        } else {
            this.houseRentAllowance = basicSalary * 0.30;
        }

        this.grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Dearness Allowance (DA): " + dearnessAllowance);
        System.out.println("House Rent Allowance (HRA): " + houseRentAllowance);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("------------------------------------");
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        // Using Constructor 1 (default DA and HRA calculation)
        Employee emp1 = new Employee("Alice", 5000);
        emp1.displayEmployeeDetails();

        // Using Constructor 1 (basic salary <= 400 for HRA calculation)
        Employee emp2 = new Employee("Bob", 350);
        emp2.displayEmployeeDetails();

        // Using Constructor 2 (custom DA and HRA percentages)
        Employee emp3 = new Employee("Charlie", 6000, 25, 40); // 25% DA, 40% HRA
        emp3.displayEmployeeDetails();
    }
}
