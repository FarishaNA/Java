import java.util.*;
class largestandsecondlargest{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        System.out.println("How many nos you want to enter :");
        int count=s.nextInt();
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter number "+(i+1)+" :");
            int num=s.nextInt();
            if(num>largest)
            {
                secondlargest=largest;
                largest=num;
            }
            else if(num>secondlargest&&num!=largest)
            {
                secondlargest=num;
            }
        }
            System.out.println("Largest number :"+largest);
            if(secondlargest==Integer.MIN_VALUE)
               System.out.println("Only one no is entered");
            else
              System.out.println("Second largest no :"+secondlargest);
        
    }
}