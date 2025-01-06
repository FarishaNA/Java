import java.util.*;
class armstrong{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number :");
        int num=s.nextInt();
        int originalno=num;
        int numdigits=0;
        int sum=0;
        int temp=num;
        while(temp>0)
        {
            numdigits++;
            temp/=10;
        }
        temp=num;
        while(temp>0)
        {
            int d=temp%10;
            sum+=Math.pow(d,numdigits);
            temp/=10;
        }
        if(sum==originalno)
           System.out.println(num +" is an armstrong number");
        else
         System.out.println(num+ " is not an armstrong number");
    }
}