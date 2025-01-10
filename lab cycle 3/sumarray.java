import java.util.*;
class sumarray{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = s.nextInt();
        int [] array = new int[n];
        int sum=0;
        System.out.println("Enter "+n+" integers");
        for(int i=0;i<n;i++)
        {
            array[i] = s.nextInt();
            sum+=array[i];
        }
        System.out.println("Sum of array is : "+sum);
    }
}