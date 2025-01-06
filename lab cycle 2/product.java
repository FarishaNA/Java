import java.util.*;
class product{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=s.nextInt();
        int sum=0;
        int previous=num%10;
        num/=10;
        while(num>0)
        {
            int d=num%10;
            sum+=d*previous;
            previous=d;
            num/=10;
        }
        System.out.println("Sum of the product of consecutive digits :"+sum);
    }
}