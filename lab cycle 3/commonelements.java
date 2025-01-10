import java.util.*;
class commonelements{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements :");
        int n1 = s.nextInt();
        int [] array1 = new int[n1];
        System.out.println("Enter the elements of the first array :");
        for(int i=0;i<n1;i++)
        {
            array1[i]=s.nextInt();
        }
        System.out.println("Enter the no of elements of second array :");
        int n2 = s.nextInt();
        int [] array2= new int[n2];
        System.out.println("Enter the elements of the second array :");
        for(int i=0;i<n2;i++)
        {
            array2[i]= s.nextInt();
        }
        System.out.println("Common elements b/w the 2 arrays :");
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(array1[i]==array2[j])
                {
                    System.out.println(array1[i]+" ");
                    array2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}