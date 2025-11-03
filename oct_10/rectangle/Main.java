public class Main {
  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle();
    System.out.println("Area of Rectangle using default constructor: " + rect1.area);

    Rectangle rect2 = new Rectangle(4, 6);
    System.out.println("Area of Rectangle using parameterized constructor taking length = 4 and breadth = 6: " + rect2.area);
  }
}
