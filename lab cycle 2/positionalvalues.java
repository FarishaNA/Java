import java.util.*;
class positionalvalues{
    public static void main(String args[]){
       Scanner s= new Scanner(System.in);
       System.out.println("Enter a number :");
       int num=s.nextInt();
       int multiplier=1;
       while(num>0)
       {
        int digit=num%10;
        int positionalvalue=digit*multiplier;
        System.out.println(positionalvalue);
        num/=10;
        multiplier*=10;
       }
    }
}