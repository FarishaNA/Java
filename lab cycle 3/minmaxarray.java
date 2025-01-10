import java.util.*;
class minmaxarray{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements :");
        int n = s.nextInt();
        int [] numbers= new int[n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++)
        {
            numbers[i]=s.nextInt();
        }
        int smallest = numbers[0];
        int largest = numbers[0];
        for(int i=1;i<n;i++){
            if(numbers[i]<smallest)
                smallest= numbers[i];
            if(numbers[i]>largest)
                largest= numbers[i];
        }
        System.out.println("Smallest element "+smallest);
        System.out.println("Largest element "+largest);
    }
}