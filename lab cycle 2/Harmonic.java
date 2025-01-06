import java.util.*;
class Harmonic{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n;
    double sum=0;
    System.out.println("Enter the value of n :");
    n=s.nextInt();
    if(n>0)
    {
        for(int i=1;i<=n;i++)
        {
            sum=sum+1.0/i;
        }
        System.out.println("Harmonic value :"+sum);
    }
    else
      System.out.println("Invalid entry");
    }
}