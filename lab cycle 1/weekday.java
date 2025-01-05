import java.util.*;
class weekday{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number b/w 1 and 7 :");
        int a;
        String week;
        a=s.nextInt();
        switch(a){
            case 1: week="Monday";
                    break;
            case 2: week="Tuesday";
                    break;
            case 3: week="Wednesday";
                    break;
            case 4: week="Thursday";
                    break;
            case 5: week="Friday";
                    break;
            case 6: week="Saturday";
                    break;
            case 7: week="Sunday";
                    break;
            default: week="Invalid day";
        }
        System.out.println("selected day is :"+ week);
    }
}