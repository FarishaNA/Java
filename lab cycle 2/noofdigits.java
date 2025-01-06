import java.util.*;
class noofdigits{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number :");
        int num=s.nextInt();
        int count=0;
        while(num!=0)
        {
            num/=10;
            count++;
        }
        System.out.println("No of digits :"+count);
    }
}