import java.util.*;
class Switch{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number :");
        double n1,n2;
        char op;
        n1=s.nextDouble();
        System.out.println("enter another number :");
        n2=s.nextDouble();
        System.out.println("enter operator(+,-,*,/):");
        op=s.next().charAt(0);
        double result=0;
        switch(op)
        {
            case '+': result=n1+n2;
                      break;
            case '-': result=n1-n2;
                      break;
            case '*': result=n1*n2;
                      break;
            case '/': if(n2!=0)
                         result=n1/n2;
                      else{
                         System.out.println("division by zero not possible");
                         return;
                      }
                      break;
            default :System.out.println("invalid operator");
        }
        System.out.println("the result is :" + result);
    }
}