void main() {
 Circle circle = new Circle(5.2);
 System.out.printf("Area of Circle (radius = 5.2) = %.2f%n", circle.area);

 Rectangle rectangle = new Rectangle(4, 7);
 System.out.printf(
   "Area of Rectangle (length=4, breadth=7) = %.2f",
   rectangle.area
 );
}
