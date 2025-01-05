class Interchange{
    public static void main(String args[]){
        int a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After interchange a is "+a);
        System.out.println("After interchang b is "+b);
    }
}