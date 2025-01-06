import java.util.*;
class factorial{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=s.nextInt();
        long factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial*=i;
        }
        System.out.println("Factorial of "+num+" is :"+factorial);
    }
}