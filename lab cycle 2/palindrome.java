import java.util.*;
class palindrome{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=s.nextInt();
        int originalno=num;
        int reversedno=0;
        while(num>0){
            int digit=num%10;
            reversedno=reversedno*10+digit;
            num/=10;
        }
        if(originalno==reversedno)
        System.out.println(originalno+"is a palindrome");
        else{
       System.out.println(originalno+"is not a palindrome");
        }
    }
}