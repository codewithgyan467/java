public class Car {
  String brand;
  int price;

  Car() {}

  Car(String brand) {
    this.brand = brand;
  }

  Car(String brand, int price) {
    this.brand = brand;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Car(brand=" + brand + ", price=" + price + ")";
  }
}
