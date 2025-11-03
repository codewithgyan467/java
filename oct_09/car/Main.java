public class Main {
  public static void main(String[] args) {
    Car car1 = new Car();
    System.out.println(car1);

    Car car2 = new Car("Audi");
    System.out.println(car2);

    Car car3 = new Car("Audi", 13000000);
    System.out.println(car3); 
  }
}
