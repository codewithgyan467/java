import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter your city: ");
        String city = sc.nextLine();
        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
        sc.close();
    }
}
