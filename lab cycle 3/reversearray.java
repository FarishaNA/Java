import java.util.*;
class reversearray{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements :");
        int n=s.nextInt();
        int [] numbers = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            numbers[i]=s.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp=numbers[i];
            numbers[i]=numbers[n-1-i];
            numbers[n-1-i]=temp;
        }
        System.out.println("Reverse array :");
        for(int i=0;i<n;i++)
          System.out.println(numbers[i]+" ");
    }
}