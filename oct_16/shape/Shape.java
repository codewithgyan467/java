public class Shape {
  public double area(double length, double breadth) {
    return length * breadth;
  }

  public double area(double radius) {
    return 2 * Math.PI * radius * radius;
  }
}
