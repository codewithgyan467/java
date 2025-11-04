public class explicitConstructorCall {
    
  class Parent {
    int value;

    Parent(int value) {
      this.value = value;
      System.out.println("Parent's constructor called with value: " + this.value);
    }
  }
class Child extends Parent {
    int childValue;

    Child(int parentValue, int childValue) {
      super(parentValue); // Explicitly calling Parent's constructor
      this.childValue = childValue;
      System.out.println("Child's constructor called with childValue: " + this.childValue);
    }
  }

  public static void main(String[] args) {
    explicitConstructorCall outer = new explicitConstructorCall();
    Child child = outer.new Child(10, 20);
    System.out.println("Value from Parent: " + child.value);
    System.out.println("Value from Child: " + child.childValue);
  }
}
