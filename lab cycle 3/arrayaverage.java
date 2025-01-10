import java.util.*;
class arrayaverage{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements :");
        int n = s.nextInt();
        int [] numbers = new int[n];
        for(int i=0;i<n;i++)
        {
        System.out.println("element "+(i+1)+":");
        numbers[i]=s.nextInt();
        }
        int sum=0;
        double average;
        for(int i=0;i<numbers.length;i++)
          sum+=numbers[i];
        average=(double)sum/n;
        System.out.println("The average of elements is :"+average);
    }
}