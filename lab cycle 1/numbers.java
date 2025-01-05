class numbers{
    public static void main(String args[]){
        int a,b,c;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c=Integer.parseInt(args[2]);
        if(a==b && b==c)
           System.out.println("all numbers are equal");
        else if(a!=b && a!=c && b!=c)
           System.out.println("all numbers are diff");
        else
          System.out.println("neither all are equal or diff");
    }
}