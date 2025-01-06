import java.util.*;
class sumaverage{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n;
        double sum,average;
        System.out.println("enter the no of the elements :");
        n=s.nextInt();
        sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter number "+i+" : ");
            double num=s.nextDouble();
            sum=sum+num;
        }
        average=sum/n;
        System.out.println("Sum :"+sum);
        System.out.println("Average :"+average);
    }
}