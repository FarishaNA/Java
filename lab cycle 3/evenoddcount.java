import java.util.*;
class evenoddcount{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        System.out.println("enter the no of elements :");
        int n = s.nextInt();
        int [] numbers = new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            numbers[i]=s.nextInt();
        }
        int evencount=0,oddcount=0;
        for(int i=0;i<n;i++){
            if(numbers[i]%2==0)
               evencount++;
            else 
               oddcount++;
        }
        System.out.println("No of even :"+evencount );
        System.out.println("No of odd :"+oddcount);
    }
}