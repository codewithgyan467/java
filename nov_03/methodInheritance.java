package mca_25.nov_03;

public class methodInheritance {

  static class Parent {
    void display() {
      System.out.println("Parent's display method");
    }
  }

  static class Child extends Parent {
    @Override
    void display() {
      super.display(); // Call the parent's display method
      System.out.println("Child's display method");
    }
  }

  public static void main(String[] args) {
    Child child = new Child();
    child.display();
  }
}
