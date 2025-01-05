class greatest{
    public static void main(String args[]){
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        if(a>b)
        {
            if(a>c)
              System.out.println("a is greatest");
            else
              System.out.println("c is greatest");
        }
        else{
            if(b>c)
             System.out.println("b is greatest");
            else
             System.out.println("c is greatest");
        }
    }
}