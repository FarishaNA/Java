import java.util.*;
class removeElement{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of elements :");
        int n = s.nextInt();
        int [] numbers = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            System.out.print("Element "+(i+1)+" :");
            numbers[i]=s.nextInt();
        }
        System.out.print("enter element to remove");
        int elementtoremove=s.nextInt();
        int [] newarray=new int[n-1];
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(numbers[i]!=elementtoremove)
              newarray[index++]=numbers[i];
        }
        if(index==n)
        System.out.println("elements not found");
        else 
        {
            System.out.println("array after removing the element :");
            for(int i=0;i<index;i++)
              System.out.print(newarray[i]+" ");
        }
    }
}