import java.util.*;
class cube{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Input no of terms :");
        int terms=s.nextInt();
        for(int i=1;i<=terms;i++)
        {
            int cube=i*i*i;
            System.out.println("Number is :"+i+" an cube of "+i+" is : "+cube);
        }
    }
}