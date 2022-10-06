import java.util.*;
class factorial{
    public static void main(String[] args) {
        System.out.println("Enter a number to find out its factorial");
        Scanner scn=new Scanner(System.in);
        long n=scn.nextLong();
        scn.close();
        long a=1l;
        for(long i=1; i<=n; i++) {
            
            a=a*i;
        }
        System.out.println("The factorial of "+n+" is "+a);

    }
}