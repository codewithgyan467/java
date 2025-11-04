import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        student student1 = new student();
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Name: "); 
        String name = scanner.nextLine(); 
        System.out.print("Enter Semester: ");
        int semester = scanner.nextInt(); 
        scanner.nextLine(); 
        System.out.print("Enter Branch: "); 
        String branch = scanner.nextLine(); 
    
        student1.setData(rollNo, name, semester, branch);
        student1.showData();
        System.out.println("Percentage: " + student1.calculate() + "%");
    
        scanner.close();
      }
    }

