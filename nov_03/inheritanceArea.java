package mca_25.nov_03;

import java.util.Scanner;

public abstract class inheritanceArea {
  protected double length;
  protected double width;

  public inheritanceArea(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public abstract double calculateArea();
}

class RectangleChild extends inheritanceArea {

  public RectangleChild(double length, double width) {
    super(length, width);
  }

  @Override
  public double calculateArea() {
    return this.length * this.width;
  }

  public double calculatePerimeter() {
    return 2 * (this.length + this.width);
  }
}

class Application {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter length of rectangle: ");
    double length = scanner.nextDouble();

    System.out.print("Enter width of rectangle: ");
    double width = scanner.nextDouble();

    RectangleChild rect = new RectangleChild(length, width);
    System.out.println("Area of Rectangle: " + rect.calculateArea());
    System.out.println("Perimeter of Rectangle: " + rect.calculatePerimeter());
    scanner.close();
  }
}
