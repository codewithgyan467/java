public class ShapeArea {
  public static void main(String[] args) {
    Shape shape = new Shape();

    System.out.println("Length: 4, Breadth: 5");
    System.out.println("Area of Rectangle (l * b): " + shape.area(4, 5));
  
    System.out.println("Radius: 3");
    System.out.printf("Area of Circle (2 * pi * r^2): %.2f", shape.area(3));

  }
}
