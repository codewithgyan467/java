import java.util.Scanner;
public class triangle {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

System.out.print("Enter the side a :-");
int a = sc.nextInt();

System.out.print("Enter the side b :-");
int b = sc.nextInt();

System.out.print("Enter the side c :-");
int c = sc.nextInt();

if (a+b>c&&a+c>b&&b+c>a) {
    System.out.println("The given sides form a valid Triangle");
    
}else{
     System.out.println("The Given sides cannot form a valid triangle");
}
  sc.close();  
}
}