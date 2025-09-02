import java.util.Scanner;

public class factorialM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to count the digit of number :-");
        int  num=sc.nextInt();
        int factorial=calnum(num);
       if(factorial==-1){
        System.out.println("Factorial cannot be calculated");
       }else{
        System.out.println("Factorial of a number "+factorial);
       }}public static int calnum(int n){
        if(n<0){
            return -1;
        }
        if(n==0){
            return 1;
        }
        int result=1;
        for(int i=1;i<=n;i++){
            result *=i;
        }
        return result;
       }
    }
