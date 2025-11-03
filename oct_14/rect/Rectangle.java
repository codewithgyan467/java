public class Rectangle {
  private int length;
  private int width;

  Rectangle() {
    this.length = 0;
    this.width = 0;
  }

  Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public int findPerimeter() {
    return length * width;
  }

  public int findArea() {
    return 2 * (length + width);
  }
}
