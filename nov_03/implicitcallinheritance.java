package mca_25.nov_03;

public class implicitcallinheritance {
    
  class Parent {
    Parent() {
      System.out.println("Parent's constructor called (implicitly from Child)");
    }
  }

  class Child extends Parent {
    Child() {
      System.out.println("Child's constructor called");
    }
  }

  public static void main(String[] args) {
    implicitcallinheritance outer = new implicitcallinheritance();
    Child child = outer.new Child();
  }
}
