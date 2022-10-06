import java.util.*;

public class ArmstrongDynamic {

    static int power(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;            
        }
        return count;
    }

    static boolean check(int n){
        int pwr=power(n);
        int a=n;
        int s=0;
        while(n>0){
            int r;
            r=n%10;
            s=s+(int) Math. pow(r,pwr);
            n=n/10;
        }
        if(s==a)return true;
            return false;
    }

        public static void main(String[] args) {
        
        System.out.println("Enter a number to find out if its an armstrong number");
        Scanner scn=new Scanner(System.in);        
        int n=scn.nextInt();
        scn.close();
        boolean a=check(n);
        if(a==true)System.out.println("This is an armstrong number");
        System.out.println("This is not an armstrong number");
            
    }
}
