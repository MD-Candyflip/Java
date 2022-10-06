import java.util.Scanner;

public class Spynumber {
    static int sum(int n){
        int s=0;
        while(n>0){
            int r=n%10;
            s=s+r;
            n=n/10;
        }
        return s;
    }
    static int  product(int n){
        int p=1;
        while(n>0){
            int r=n%10;
            p=p*r;
            n=n/10;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number to check for spy number");
        int n=scn.nextInt();
        scn.close();
        if(sum(n)==product(n))System.out.println("The number "+n+" is SPYYY");
        else System.out.println("The number "+n+" is not SPYYY");
    }
}
