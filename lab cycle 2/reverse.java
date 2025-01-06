import java.util.*;
class reverse{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=s.nextInt();
        int reverse=0;
        while(num!=0)
        {
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        System.out.println("Reversed number is :"+reverse);
    }
}