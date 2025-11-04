
import java.util.Scanner;

public class inheritance {

  
  static class Parent { 
    String parentName;

    public Parent(String parentName) {
      this.parentName = parentName;
    }

    public void displayParentName() {
      System.out.println("Parent's name: " + this.parentName);
    }
  }
  static class Child extends Parent { 
    String name;

    public Child(String parentName, String name) {
      super(parentName);
      this.name = name;
    }

    public void displayChildName() {
      System.out.println("Child's name: " + this.name);
    }
  }

  
  public static class Application {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter parent's name: ");
      String parentName = scanner.nextLine();

      System.out.print("Enter child's name: ");
      String childName = scanner.nextLine();

      Child myChild = new Child(parentName, childName);

      myChild.displayParentName();
      myChild.displayChildName();

      scanner.close();
    }
  }
}
