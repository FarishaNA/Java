class booltest{
    public static void main(String arg[]){
        boolean b;
        b=false;
        System.out.println("b is "+b);
        b=true;
        System.out.println("b is "+b);
        if(b)System.out.println("executed");
        b=false;
        if(b)System.out.println("not executed");
        System.out.println("10>9  is "+(10>9));
    }
}