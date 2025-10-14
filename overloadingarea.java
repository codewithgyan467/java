class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class overloadingarea {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Area of rectangle: " + rect.calculateArea());
        System.out.println("Perimeter of rectangle: " + rect.calculatePerimeter());
    }
}
