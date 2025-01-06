import java.util.*;
class multiplication{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter an integer :");
    int num=s.nextInt();
    System.out.println("Multipication table for "+num+" : ");
    for(int i=1;i<=10;i++)
    {
        System.out.println(num+" x "+i+" = "+(num*i));
    }
}
}