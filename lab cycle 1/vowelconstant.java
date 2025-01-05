import java.util.*;
class vowelconstant{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a single character :");
        String a;
        a=s.next();
        if(a.length()!=1)
          System.out.println("please enter exactly one character");
        else
        {
            char ch;
            ch = a.charAt(0);
            if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                  System.out.println("vowel");
                else
                  System.out.println("Constant");
            }
            else
              System.out.println("the entered charcter is not a valid letter");
        }

    }
}