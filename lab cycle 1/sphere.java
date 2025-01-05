class sphere{
    public static void main(String args[]){
        double pi=3.1416;
        double r;
        r=Double.parseDouble(args[0]);
        double volume=(4*pi*r*r)/3;
        System.out.println("volume of a sphere is " +volume);
    }
}