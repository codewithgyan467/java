public class implicitcallinheritance {
    
  static class Parent {
    Parent() {
      System.out.println("Parent's constructor called");
    }
  }

  static class Child extends Parent {
    Child() {
      System.out.println("Child's constructor called");
    }
  }

  public static void main(String[] args) {
    Child child = new Child();
  }
}
