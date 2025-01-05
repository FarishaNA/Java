class student{
    public static void main(String args[]){
        int a;
        a=Integer.parseInt(args[0]);
        if(a>=90)
          System.out.println("outstanding");
        else if(a>=80)
           System.out.println("excellent");
        else if(a>=70)
           System.out.println("very good");
        else if(a>=60)
           System.out.println("Good");
        else if(a>=50)
           System.out.println("average");
        else
          System.out.println("fail");
    }
}