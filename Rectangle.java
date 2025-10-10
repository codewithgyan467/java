
 
public class Rectangle {
    private double length;
    private double breadth;
    private double area;

   
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
        this.area = 0;
    }

    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth; 
    }

   
    public void displayArea() {
        System.out.println("Rectangle Details -> Length: " + length + ", Breadth: " + breadth + ", Area: " + area);
    }
}
