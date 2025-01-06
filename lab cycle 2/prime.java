import java.util.*;
class prime{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        //read upper limit from user
        System.out.print("enter an upper limit :");
        int upperlimit=s.nextInt();

        //print prime numbers upto the given upperlimit
        System.out.println("prime numbers upto "+ upperlimit+ " :");
        for(int num=2;num<=upperlimit;num++){
            boolean isprime=true;

            //check if num is prime
            if(num>3){
                if(num%2==0||num%3==0){
                    isprime=false;
                    //eliminates multiples of 2 and 3
                }
                else{
                    //check for factors form 5 to sqrt(num)
                    for(int i=5;i*i<=num;i+=6){
                        if(num%i==0||num%(i+2)==0){
                            isprime=false;
                            break;
                        }
                    }
                }
            }
            //print the numbr if it is prime
            if(isprime){
                System.out.print(num +" ");
            }
        }
        //close the scanner
        s.close();
    }
}