import java.util.*;
class quadratic{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter coefficient a :");
        double a,b,c,discriminant,r1,r2;
        a=s.nextDouble();
        System.out.println("Enter coefficient b :");
        b=s.nextDouble();
        System.out.println("Enter coefficient c :");
        c=s.nextDouble();
        discriminant=b*b - 4*a*c;
        if(discriminant>0)
        {
            r1=(-b+Math.sqrt(discriminant))/(2*a);
            r2=(-b-Math.sqrt(discriminant))/(2*a);

            System.out.println("the equations has 2 real and distict solutions");
            System.out.println("Root 1 :"+r1);
            System.out.println("Root 2 :"+r2);
        }
        else if(discriminant==0)
        {
            double root=-b/(2*a);
            System.out.println("Root :"+root);
        }
        else{
            System.out.println("the equation has no real solutions");
        }
    }
}