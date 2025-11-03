class Rectangle {
  int length;
  int width;

  Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  int area() {
    return length * width;
  }

  int perimeter() {
    return 2 * (length + width);
  }
}

public class RectangleAreaPerimeter {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(2, 4);

    System.out.println("(Rectangle) length: " + rect.length + ", width: " + rect.width);
    System.out.println("Area of the rectangle: " + rect.area());
    System.out.println("Perimeter of the rectangle: " + rect.perimeter());
  }
}
