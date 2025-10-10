
public class RectangleDemo {
    public static void main(String[] args) {
        System.out.println("--- Creating a Rectangle using the default constructor ---");
      
        Rectangle rect1 = new Rectangle();
      
        rect1.displayArea();

        System.out.println("\n--- Creating a Rectangle using the parameterized constructor ---");
       
        Rectangle rect2 = new Rectangle(12.5, 4.0);

        rect2.displayArea();
    }
}
