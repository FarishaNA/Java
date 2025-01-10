import java.util.*;
class insertelement{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        System.out.print("Enter the no of elements :");
        int n = s.nextInt();
        int [] numbers = new int[n+1];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++)
        {
            numbers[i] = s.nextInt();
        }
        System.out.print("Enter the element to insert :");
        int elementtoinsert= s.nextInt();
        System.out.print("Enter the position to insert :");
        int position = s.nextInt();
        if(position<1||position>n+1)
        {
            System.out.println("Invalid position please enter b/w 1 and "+(n+1)+":");
    
        }
        else
        {
            for(int i=n;i>=position;i--)
               numbers[i]=numbers[i-1];
            numbers[position-1]=elementtoinsert;
            System.out.println("Array after inserting :");
            for (int i=0;i<=n;i++)
              System.out.print(numbers[i]+":");
        }
    }
}