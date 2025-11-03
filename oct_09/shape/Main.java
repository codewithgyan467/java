public class Main {
  public static void main(String[] args) {
    Shape shape = new Shape();
 
    System.out.printf("Side = %d, Area of square = %d%n", 6, shape.area(6));
    System.out.printf("Length = %d and Breadth = %d, Area of rect. = %d%n", 4, 2, shape.area(4, 2));
    System.out.printf("Radius = %.2f, Area of circle = %.2f%n", 5.3, shape.area(5.3));
  }
}
