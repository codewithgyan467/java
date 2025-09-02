import java.util.Scanner;

public class suqare {
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:-");
    int num=sc.nextInt();
    int suqare=Calc(num);
    System.out.print("Square of" +num+" is:-"+suqare);
   }
   public static int Calc(int num){
    return num*num;
   }
   }