//-Create a class Rectangle with members length and width. Add a method to calculate area and perimeter, then display the results for a rectangle.
class Rectangle{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    int area() {
return length*width;
    }
    int perimeter() {
        return 2*(length+width);
    }
}



public class RAP {

     public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 4);
        System.out.println("(Rectangle) length:- "+rect.length+",width:- "+rect.width);
        System.out.println("Area of rectangle is :- "+rect.area());
System.out.println("Perimeter of rectangle is :- "+rect.perimeter());
     }
}