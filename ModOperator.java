import java.util.*;
public class ModOperator {

    static int mod(int n,int d){
        int q=n/d;
        int r=n-q*d;        
        return r;
    }

    static void checkifeven(int n){
        int a=mod(n,2);
        if(a==0&&n!=0)System.out.println("The number is even");
        else if (n==0)System.out.println("The number is neither odd or even");
        else System.out.println("The number is odd");
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number to check if its odd or even");
        int a=scn.nextInt();
        checkifeven(a);
        scn.close();

    }
}
