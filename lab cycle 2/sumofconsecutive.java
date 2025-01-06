import java.util.*;
class sumofconsecutive{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=s.nextInt();
        int sum=0;
        int previous=-1;
        while(num>0)
        {
            int current=num%10;
            if(previous!=-1)
            {
                sum+=current*10+previous;
            }
            previous=current;
            num/=10;
        }
        System.out.println("Sum :"+sum);
    }
}