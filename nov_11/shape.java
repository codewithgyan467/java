public class shape {
    public double area() {
        return 0;
    }
}

class Circle extends shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        System.out.println("Area of the circle: " + myCircle.area());
    }
}
